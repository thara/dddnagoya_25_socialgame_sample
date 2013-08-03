package dddnagoya.raidboss.battle.encounting;

import dddnagoya.raidboss.Event;
import dddnagoya.raidboss.Player;
import dddnagoya.raidboss.battle.RaidBossFeature;

/**
 * @author t_hara
 */
public class EncountingRaidBossEvent implements Event {

    private RaidBossFeature feature;
    
    private Player player;
    
    private long battleDuration;
    
    /**
     * @param feature
     * @param player
     * @param battleDuration
     */
    public EncountingRaidBossEvent(RaidBossFeature feature, Player player,
            long battleDuration) {
        super();
        this.feature = feature;
        this.player = player;
        this.battleDuration = battleDuration;
    }

    public RaidBossFeature getFeature() {
        return feature;
    }
    
    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }
    
    /**
     * @return the battleDuration
     */
    public long getBattleDuration() {
        return battleDuration;
    }
}
