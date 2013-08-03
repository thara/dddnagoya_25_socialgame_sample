package dddnagoya.raidboss.battle;

import java.math.BigDecimal;

/**
 * @author t_hara
 */
public class RaidBoss {
    
    private String name;

    private BigDecimal hitPoint;

    /**
     * @param name
     * @param hitPoint
     */
    public RaidBoss(String name, BigDecimal hitPoint) {
        super();
        this.name = name;
        this.hitPoint = hitPoint;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the hitPoint
     */
    public BigDecimal getHitPoint() {
        return hitPoint;
    }
}
