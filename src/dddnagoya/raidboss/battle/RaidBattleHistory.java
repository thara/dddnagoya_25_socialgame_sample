package dddnagoya.raidboss.battle;

/**
 * @author t_hara
 */
public class RaidBattleHistory {

    private int latestLevel = 1;

    public void addLevel(int level) {
        latestLevel += level;
    }

    public int getLatestLevel() {
        return latestLevel;
    }
}
