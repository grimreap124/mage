package mage.abilities.meta;

import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.target.targetpointer.FixedTarget;
import mage.util.CardUtil;
import mage.watchers.Watcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * A triggered ability that combines several others and triggers whenever one or
 * more of them would. The abilities passed in should have null as their effect,
 * and should have their own targets set if necessary. All other information
 * will be passed in from changes to this Ability. Note: this does NOT work with
 * abilities that have intervening if clauses.
 *
 * @author noahg
 */
public class OrTriggeredAbility extends TriggeredAbilityImpl {

    private final String ruleTrigger;
    private final List<TriggeredAbility> triggeredAbilities = new ArrayList<>();
    private final boolean setTarget;

    public OrTriggeredAbility(Zone zone, Effect effect, TriggeredAbility... abilities) {
        this(zone, effect, false, null, false, abilities);
    }

    public OrTriggeredAbility(Zone zone, Effect effect, boolean setTarget, TriggeredAbility... abilities) {
        this(zone, effect, false, null, setTarget, abilities);
    }

    public OrTriggeredAbility(Zone zone, Effect effect, boolean optional, String ruleTrigger, TriggeredAbility... abilities) {
        this(zone, effect, optional, ruleTrigger, false, abilities);
    }

    public OrTriggeredAbility(Zone zone, Effect effect, boolean optional, String ruleTrigger, boolean setTarget, TriggeredAbility... abilities) {
        super(zone, effect, optional);
        this.ruleTrigger = ruleTrigger;
        this.withRuleTextReplacement(false);
        this.setTarget = setTarget;
        Collections.addAll(this.triggeredAbilities, abilities);
        for (TriggeredAbility ability : triggeredAbilities) {
            //Remove useless data
            ability.getEffects().clear();

            for(Watcher watcher : ability.getWatchers()) {
                super.addWatcher(watcher);
            }
        }
        setTriggerPhrase(generateTriggerPhrase());
    }

    public OrTriggeredAbility(OrTriggeredAbility ability) {
        super(ability);
        this.ruleTrigger = ability.ruleTrigger;
        this.setTarget = ability.setTarget;
        for (TriggeredAbility triggeredAbility : ability.triggeredAbilities) {
            this.triggeredAbilities.add(triggeredAbility.copy());
        }
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        for (TriggeredAbility ability : triggeredAbilities) {
            if (ability.checkEventType(event, game)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        boolean toRet = false;
        for (TriggeredAbility ability : triggeredAbilities) {
            if (ability.checkEventType(event, game) && ability.checkTrigger(event, game)) {
                toRet = true;
                if (setTarget) {
                    getEffects().setTargetPointer(new FixedTarget(event.getTargetId(), game));
                }
            }
        }
        return toRet;
    }

    @Override
    public OrTriggeredAbility copy() {
        return new OrTriggeredAbility(this);
    }

    private String generateTriggerPhrase() {
        if (ruleTrigger != null && !ruleTrigger.isEmpty()) {
            return ruleTrigger;
        }
        return triggeredAbilities
                .stream()
                .map(Ability::getRule)
                .map(CardUtil::getTextWithFirstCharLowerCase)
                .map(s -> s.substring(0, s.length() - 2))
                .collect(Collectors.joining(" or ")) + ", ";
    }

    @Override
    public void setControllerId(UUID controllerId) {
        super.setControllerId(controllerId);
        for (TriggeredAbility ability : triggeredAbilities) {
            ability.setControllerId(controllerId);
        }
    }

    @Override
    public void setSourceId(UUID sourceId) {
        super.setSourceId(sourceId);
        for (TriggeredAbility ability : triggeredAbilities) {
            ability.setSourceId(sourceId);
        }
    }

    @Override
    public void addWatcher(Watcher watcher) {
        super.addWatcher(watcher);
        for (TriggeredAbility ability : triggeredAbilities) {
            ability.addWatcher(watcher);
        }
    }
}
