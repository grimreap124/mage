package mage.cards.s;

import java.util.Stack;
import java.util.UUID;

import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.stack.Spell;
import mage.game.stack.StackAbility;
import mage.game.stack.StackObject;
import mage.target.common.TargetCardInYourGraveyard;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.delayed.ManaSpentDelayedTriggeredAbility;
import mage.abilities.costs.common.ExileFromGraveCost;
import mage.abilities.costs.common.ExileFromTopOfLibraryCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CopySourceSpellEffect;
import mage.abilities.effects.common.CopySpellForEachItCouldTargetEffect;
import mage.abilities.effects.common.CopyStackObjectEffect;
import mage.abilities.effects.common.CopyTargetStackObjectEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;

/**
 *
 * @author grimreap124
 */
public final class SunkenPalace extends CardImpl {

    public SunkenPalace(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[] { CardType.LAND }, "");

        this.subtype.add(SubType.CAVE);

        // Sunken Palace enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());
        // {T}: Add {U}.
        this.addAbility(new BlueManaAbility());
        // {1}{U}, {T}, Exile seven cards from your graveyard: Add {U}.
        // When you spend this mana to cast a spell or activate an ability, copy that spell or ability. You may choose new targets for the copy.
        Ability ability = new SimpleManaAbility(Zone.BATTLEFIELD, Mana.ColorlessMana(2), new ManaCostsImpl<>("{1}{U}"));
        ability.addCost(new TapSourceCost());
        ability.addCost(new ExileFromGraveCost(new TargetCardInYourGraveyard(7)));
        ability.addEffect(new CreateDelayedTriggeredAbilityEffect(new SunkenPalaceTriggeredAbility()));
        this.addAbility(ability);

    }

    private SunkenPalace(final SunkenPalace card) {
        super(card);
    }

    @Override
    public SunkenPalace copy() {
        return new SunkenPalace(this);
    }
}


class SunkenPalaceTriggeredAbility extends DelayedTriggeredAbility {

    SunkenPalaceTriggeredAbility() {
        super(new CopyStackObjectEffect(), Duration.EndOfTurn, true, false);
    }

    private SunkenPalaceTriggeredAbility(final SunkenPalaceTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public SunkenPalaceTriggeredAbility copy() {
        return new SunkenPalaceTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ACTIVATED_ABILITY
                || event.getType() == GameEvent.EventType.SPELL_CAST;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (!getSourceId().equals(event.getSourceId())) {
            return false;
        }
        if (!event.getPlayerId().equals(getControllerId())) {
            return false;
        }

        // activated ability
        if (event.getType() == GameEvent.EventType.ACTIVATED_ABILITY) {
            StackAbility stackAbility = (StackAbility) game.getStack().getStackObject(event.getSourceId());
            if (stackAbility != null && !stackAbility.getStackAbility().isManaActivatedAbility()) {
                this.getEffects().setValue("stackObject", (StackObject) stackAbility);
                return true;
            }
        }

        // spell
        if (event.getType() == GameEvent.EventType.SPELL_CAST) {
            Spell spell = game.getStack().getSpell(event.getTargetId());
            if (spell != null) {
                this.getEffects().setValue("stackObject", (StackObject) spell);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getRule() {
        return "When you spend this mana to cast a spell or activate an ability, copy that spell or ability. You may choose new targets for the copy.";
    }
}
