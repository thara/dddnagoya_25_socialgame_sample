package dddnagoya.raidboss.battle;

import java.math.BigDecimal;

/**
 * @author t_hara
 */
public class RaidBossFeature {
    
    private String raidBossName;

    private BigDecimal maxHitPoint;
    
    /**
     * @param raidBossName
     * @param maxHitPoint
     */
    public RaidBossFeature(String raidBossName, BigDecimal maxHitPoint) {
        super();
        this.raidBossName = raidBossName;
        this.maxHitPoint = maxHitPoint;
    }

    public RaidBoss createRaidBoss(RaidBattleHistory history) {
        return new RaidBoss(raidBossName, maxHitPoint.multiply(new BigDecimal(history.getLatestLevel() * 100)));
    }
}
