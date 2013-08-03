package dddnagoya.raidboss.battle;

import dddnagoya.raidboss.Player;

import java.util.Calendar;

/**
 * @author t_hara
 */
public class RaidBattle {

    private final RaidBoss raidBoss;
    
    private final Calendar startTime;
    
    private final long battleDuration;
    
    private final Player player;

    /**
     * @param raidBoss
     * @param startTime
     * @param battleDuration
     * @param player
     */
    public RaidBattle(RaidBoss raidBoss, Calendar startTime,
            long battleDuration, Player player) {
        super();
        this.raidBoss = raidBoss;
        this.startTime = startTime;
        this.battleDuration = battleDuration;
        this.player = player;
    }

    /**
     * @return the raidBoss
     */
    public RaidBoss getRaidBoss() {
        return raidBoss;
    }

    /**
     * @return the startTime
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * @return the battleDuration
     */
    public long getBattleDuration() {
        return battleDuration;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }
}
