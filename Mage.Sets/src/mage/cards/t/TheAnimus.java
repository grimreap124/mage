package mage.cards.t;

import java.util.List;
import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.common.ActivateAsSorceryActivatedAbility;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.OneShotEffect;
import mage.cards.*;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterCreatureCard;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.Target;
import mage.target.Targets;
import mage.target.common.*;
import mage.util.functions.EmptyCopyApplier;

/**
 *
 * @author grimreap124
 */
public final class TheAnimus extends CardImpl {

    private static final FilterCard filter = new FilterCreatureCard("legendary creature card");
    private static final FilterCard exileFilter = new FilterCreatureCard("creature card in exile with a memory counter on it");

    static {
        filter.add(SuperType.LEGENDARY.getPredicate());
        exileFilter.add(CounterType.MEMORY.getPredicate());
    }

    public TheAnimus(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");
        
        this.supertype.add(SuperType.LEGENDARY);

        // At the beginning of your end step, exile up to one target legendary creature card from a graveyard with a memory counter on it.
        Ability ability = new BeginningOfEndStepTriggeredAbility(new TheAnimusEffect(), TargetController.YOU, false);
        ability.addTarget(new TargetCardInGraveyard(0, 1, filter));
        this.addAbility(ability);

        // {T}: Until your next turn, target legendary creature you control becomes a copy of target creature card in exile with a memory counter on it. Activate only as a sorcery.
        ability = new ActivateAsSorceryActivatedAbility(new TheAnimusCopyEffect(), new TapSourceCost());
        ability.addTarget(new TargetCreaturePermanentSameController(1, StaticFilters.FILTER_CREATURE_LEGENDARY));
        ability.addTarget(new TargetCardInExile(1, 1, exileFilter));
        this.addAbility(ability);
    }

    private TheAnimus(final TheAnimus card) {
        super(card);
    }

    @Override
    public TheAnimus copy() {
        return new TheAnimus(this);
    }
}

class TheAnimusEffect extends OneShotEffect {

    TheAnimusEffect() {
        super(Outcome.Benefit);
        staticText = "exile up to one target legendary creature card from a graveyard with a memory counter on it";
    }

    private TheAnimusEffect(final TheAnimusEffect effect) {
        super(effect);
    }

    @Override
    public TheAnimusEffect copy() {
        return new TheAnimusEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
//        TheAnimusWatcher watcher = game.getState().getWatcher(TheAnimusWatcher.class);
        if (controller == null) {
            return false;
        }

        Card card = game.getCard(getTargetPointer().getFirst(game, source));
        controller.moveCards(card, Zone.EXILED, source, game);
        card.addCounters(CounterType.MEMORY.createInstance(), source.getControllerId(), source, game);
//        watcher.addCard(controller.getId(), card, game)
        return true;
    }
}

class TheAnimusCopyEffect extends OneShotEffect {

    TheAnimusCopyEffect() {
        super(Outcome.Copy);
        this.staticText = "target legendary creature you control becomes a copy of target creature card in exile with a memory counter on it";
    }

    private TheAnimusCopyEffect(final TheAnimusCopyEffect effect) {
        super(effect);
    }

    @Override
    public TheAnimusCopyEffect copy() {
        return new TheAnimusCopyEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent sourcePermanent = game.getPermanent(source.getSourceId());
        Targets targets = source.getTargets();

        if (targets.size() != 2) {
            game.informPlayers("Target size: " + targets.size());
            game.informPlayers("source target size " + source.getTargets().size());
            return false;
        }
        UUID target1Id = source.getTargets().get(0).getFirstTarget();
        UUID target2Id = source.getTargets().get(1).getFirstTarget();


        if (target2Id == null || target1Id == null) {
            return false;
        }
        game.informPlayers("Targets are good");
        Permanent copyToPermanent = game.getPermanent(target1Id);

        Card copyFromPermanent = game.getCard(target2Id);

        if (copyFromPermanent == null) {
            game.informPlayers("copyFromPermanent is null");
        }
        if (sourcePermanent == null || copyFromPermanent == null) {
            game.informPlayers("can't get perms");
            return false;
        }

        game.informPlayers("copyFromPermanent: " + copyFromPermanent.getName() + " copyToPermanent: " + copyToPermanent.getName());
        game.copyPermanent(Duration.EndOfTurn, copyFromPermanent, copyToPermanent.getId(), source, new EmptyCopyApplier());

        return true;
    }
}