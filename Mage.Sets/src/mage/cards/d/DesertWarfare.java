package mage.cards.d;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.common.SacrificePermanentTriggeredAbility;
import mage.abilities.common.ZoneChangeAllTriggeredAbility;
import mage.abilities.common.ZoneChangeTriggeredAbility;
import mage.abilities.common.delayed.AtTheBeginOfNextEndStepDelayedTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.meta.OrTriggeredAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.FilterPermanent;
import mage.game.Game;
import mage.players.Player;

/**
 *
 * @author anonymous
 */
public final class DesertWarfare extends CardImpl {

    private static final FilterPermanent filter = new FilterPermanent("Desert");

    static {
        filter.add(SubType.DESERT.getPredicate());
        filter.add(TargetController.YOU.getControllerPredicate());
    }

    public DesertWarfare(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{G}");
        

        // Whenever you sacrifice a Desert and whenever a Desert card is put into your graveyard from your hand or library, put that a at the beginning of your next end step.
        TriggeredAbility handToGraveyard = new ZoneChangeAllTriggeredAbility(Zone.ALL, Zone.HAND, Zone.GRAVEYARD, null, filter,"hand", false);
        TriggeredAbility libraryToGraveyard = new ZoneChangeAllTriggeredAbility(Zone.ALL, Zone.LIBRARY, Zone.GRAVEYARD, null, filter, "library", false);
        Effect effect = new CreateDelayedTriggeredAbilityEffect(
                new AtTheBeginOfNextEndStepDelayedTriggeredAbility(
                        new DesertWarfareEffect()));

        TriggeredAbility ability = new SacrificePermanentTriggeredAbility(Zone.BATTLEFIELD, null, filter, TargetController.YOU, SetTargetPointer.PERMANENT, false);
        OrTriggeredAbility orAbility = new OrTriggeredAbility(Zone.BATTLEFIELD, effect, true, ability, handToGraveyard, libraryToGraveyard);
        this.addAbility(orAbility);
        // At the beginning of combat on your turn, if you control five or more Deserts, create that many 1/1 red, green, and white Sand Warrior creature tokens. They gain haste.
    }

    private DesertWarfare(final DesertWarfare card) {
        super(card);
    }

    @Override
    public DesertWarfare copy() {
        return new DesertWarfare(this);
    }
}

class DesertWarfareEffect extends OneShotEffect {

    private static final FilterCard filter = new FilterCard("an artifact card");

    static {
        filter.add(CardType.ARTIFACT.getPredicate());
    }

    public DesertWarfareEffect() {
        super(Outcome.PutCardInPlay);
        staticText = "Search target opponent's library for an artifact card and put that card onto the battlefield under your control. Then that player shuffles";
    }

    private DesertWarfareEffect(final DesertWarfareEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        game.informPlayers("Apply!!!!");
        Player player = game.getPlayer(source.getControllerId());
        if (player != null) {
            UUID target = source.getTargets().getFirstTarget();
            game.informPlayers("Target: " + target);
            Card targetCard = game.getCard(getTargetPointer().getFirst(game, source));
            if (targetCard != null) {
                player.moveCards(targetCard, Zone.BATTLEFIELD, source, game);
                return true;
            }
            game.informPlayers("No card found");
        }

        return false;
    }

    @Override
    public DesertWarfareEffect copy() {
        return new DesertWarfareEffect(this);
    }
}