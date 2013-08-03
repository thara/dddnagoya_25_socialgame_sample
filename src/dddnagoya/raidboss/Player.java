package dddnagoya.raidboss;

import dddnagoya.raidboss.battle.RaidBattleHistory;

import java.math.BigDecimal;

/**
 * @author t_hara
 */
public class Player {

    private final long id;
    
    private final RaidBattleHistory history;
    
    private final BigDecimal hitPoint;

    /**
     * @param id
     * @param history
     * @param hitPoint
     */
    public Player(long id, RaidBattleHistory history, BigDecimal hitPoint) {
        super();
        this.id = id;
        this.history = history;
        this.hitPoint = hitPoint;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the history
     */
    public RaidBattleHistory getHistory() {
        return history;
    }

    /**
     * @return the hitPoint
     */
    public BigDecimal getHitPoint() {
        return hitPoint;
    }
}
