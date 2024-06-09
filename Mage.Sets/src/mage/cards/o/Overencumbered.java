package mage.cards.o;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.costs.Cost;
import mage.abilities.dynamicvalue.common.ArtifactYouControlCount;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.*;
import mage.abilities.effects.common.combat.CantAttackAllEffect;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.ClueArtifactToken;
import mage.game.permanent.token.FoodToken;
import mage.game.permanent.token.JunkToken;
import mage.game.stack.Spell;
import mage.players.Player;
import mage.target.common.TargetOpponent;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.util.CardUtil;
import mage.util.ManaUtil;

/**
 *
 * @author anonymous
 */
public final class Overencumbered extends CardImpl {

    public Overencumbered(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{W}");
        
        this.subtype.add(SubType.AURA);

        // Enchant opponent
        TargetOpponent auraTarget = new TargetOpponent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        this.addAbility(new EnchantAbility(auraTarget));

        // When Overencumbered enters the battlefield, enchanted opponent creates a Clue token, a Food token, and a Junk token.
        Ability ability = new EntersBattlefieldTriggeredAbility(new OverencumberedTokenEffect());
//        ability.addTarget(auraTarget);
        this.addAbility(ability);

        // At the beginning of combat on enchanted opponent's turn, that player may pay {1} for each artifact they control.
        // If they don't, creatures can't attack this combat.
        ability = new BeginningOfCombatTriggeredAbility(new OverencumberedEffect()
                .setText("At the beginning of combat on enchanted opponent's turn," +
                        " that player may pay {1} for each artifact they control. If they don't, creatures can't attack this combat."),
                TargetController.ENCHANTED,
                false);
        this.addAbility(ability);

    }

    private Overencumbered(final Overencumbered card) {
        super(card);
    }

    @Override
    public Overencumbered copy() {
        return new Overencumbered(this);
    }
}

class OverencumberedTokenEffect extends OneShotEffect {

    OverencumberedTokenEffect() {
        super(Outcome.Benefit);
        setText("enchanted opponent creates a Clue token, a Food token, and a Junk token");
    }

    private OverencumberedTokenEffect(final OverencumberedTokenEffect effect) {
        super(effect);
    }

    @Override
    public OverencumberedTokenEffect copy() {
        return new OverencumberedTokenEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
//        game.informPlayers("targets" + getTargetPointer().toString());
//        getTargetPointer().getFirst(game, source);
        Spell spell = game.getStack().getSpell(source.getId());
        Permanent enchantment = source.getSourcePermanentIfItStillExists(game);
        Permanent permanent = game.getPermanentOrLKIBattlefield(source.getSourceId());

        game.informPlayers("effects: " + spell.getSpellAbility().getTargets().getFirstTarget());
        boolean clue = new ClueArtifactToken().putOntoBattlefield(1, game, source, getTargetPointer().getFirst(game, source));
        boolean food = new FoodToken().putOntoBattlefield(1, game, source, getTargetPointer().getFirst(game, source));
        boolean junk = new JunkToken().putOntoBattlefield(1, game, source, getTargetPointer().getFirst(game, source));
        return clue && food && junk;
    }
}

class OverencumberedEffect extends OneShotEffect {

    OverencumberedEffect() {
        super(Outcome.Benefit);
        setText("that player may pay {1} for each artifact they control. If they don't, creatures can't attack this combat.");
    }

    private OverencumberedEffect(final OverencumberedEffect effect) {
        super(effect);
    }

    @Override
    public OverencumberedEffect copy() {
        return new OverencumberedEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(game.getActivePlayerId());
        Permanent permanent = game.getPermanent(source.getSourceId());
        if (player == null || permanent == null) {
            return false;
        }
        int numArtifacts = ArtifactYouControlCount.instance.calculate(game, source, this);
        Cost cost = ManaUtil.createManaCost(numArtifacts, false);
        if (cost.pay(source, game, source, player.getId(), false)) {
            return true;
        }
        game.addEffect(new CantAttackAllEffect(Duration.EndOfCombat, StaticFilters.FILTER_PERMANENT_CREATURES), source);
        return true;
    }
}