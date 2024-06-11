package mage.cards.t;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.EntersBattlefieldEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CastSourceTriggeredAbility;
import mage.abilities.effects.common.CopyEffect;
import mage.cards.Card;
import mage.constants.*;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.counters.CounterType;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterCreatureCard;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.Targets;
import mage.target.common.TargetCardInExile;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanentSameController;

/**
 *
 * @author anonymous
 */
public final class TheMasterFormedAnew extends CardImpl {

    private static final FilterCard exileFilter = new FilterCreatureCard("takeover counter");
    static {
        exileFilter.add(CounterType.TAKEOVER.getPredicate());
    }

    public TheMasterFormedAnew(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{U}{B}");
        
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.TIME_LORD);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(0);
        this.toughness = new MageInt(1);

        // Body Thief -- When you cast this spell, you may exile a creature you control and put a takeover counter on it.
        Ability ability = new CastSourceTriggeredAbility(new TheMasterFormedAnewEffect(), true);
        ability.addTarget(new TargetControlledCreaturePermanent());
        this.addAbility(ability);
        // You may have The Master, Formed Anew enter the battlefield as a copy of a creature card in exile with a takeover counter on it.
        ability = new EntersBattlefieldAbility(new TheAnimusCopyEffect(), true);
        ability.addTarget(new TargetCardInExile(1, 1, exileFilter));
        this.addAbility(ability);
    }

    private TheMasterFormedAnew(final TheMasterFormedAnew card) {
        super(card);
    }

    @Override
    public TheMasterFormedAnew copy() {
        return new TheMasterFormedAnew(this);
    }
}

class TheMasterFormedAnewEffect extends OneShotEffect {

    TheMasterFormedAnewEffect() {
        super(Outcome.Benefit);
        staticText = "you may exile a creature you control and put a takeover counter on it";
    }

    private TheMasterFormedAnewEffect(final TheMasterFormedAnewEffect effect) {
        super(effect);
    }

    @Override
    public TheMasterFormedAnewEffect copy() {
        return new TheMasterFormedAnewEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        UUID targetId = getTargetPointer().getFirst(game, source);
        if (controller == null || targetId == null) {
            return false;
        }

        Card card = game.getCard(targetId);
        if (card == null) {
            return false;
        }
        controller.moveCards(card, Zone.EXILED, source, game);
        if (game.getState().getZone(card.getId()) != Zone.EXILED) {
            return false;
        }
        card.addCounters(CounterType.TAKEOVER.createInstance(), source.getControllerId(), source, game);
        return true;
    }
}

class TheAnimusCopyEffect extends OneShotEffect {

    TheAnimusCopyEffect() {
        super(Outcome.Copy);
        this.staticText = "You may have {this} enter the battlefield as a copy of a creature card in exile with a takeover counter on it";
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

        UUID targetId = source.getTargets().getFirstTarget();

        if (targetId == null) {
            return false;
        }
        Card copyFromPermanent = game.getCard(targetId);
        if (sourcePermanent == null || copyFromPermanent == null) {
            return false;
        }

        ContinuousEffect copyEffect = new CopyEffect(Duration.EndOfTurn, copyFromPermanent.getMainCard(), targetId);
        game.addEffect(copyEffect, source);
        return true;
    }
}