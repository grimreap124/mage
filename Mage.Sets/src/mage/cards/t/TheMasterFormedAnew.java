package mage.cards.t;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.effects.common.CastSourceTriggeredAbility;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class TheMasterFormedAnew extends CardImpl {

    public TheMasterFormedAnew(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{U}{B}");
        
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.TIME);
        this.subtype.add(SubType.LORD);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(0);
        this.toughness = new MageInt(1);

        // Body Thief -- When you cast this spell, you may exile a creature you control and put a takeover counter on it.
        Ability ability = new CastSourceTriggeredAbility(new )
        // You may have The Master, Formed Anew enter the battlefield as a copy of a creature card in exile with a takeover counter on it.
    }

    private TheMasterFormedAnew(final TheMasterFormedAnew card) {
        super(card);
    }

    @Override
    public TheMasterFormedAnew copy() {
        return new TheMasterFormedAnew(this);
    }
}
