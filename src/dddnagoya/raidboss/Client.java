package dddnagoya.raidboss;

import dddnagoya.raidboss.battle.RaidBattle;
import dddnagoya.raidboss.battle.RaidBattleHistory;
import dddnagoya.raidboss.battle.RaidBoss;
import dddnagoya.raidboss.battle.RaidBossFeature;
import dddnagoya.raidboss.battle.encounting.EncountingRaidBossEvent;
import dddnagoya.raidboss.battle.encounting.EncountingRaidBossService;

import java.math.BigDecimal;

/**
 * @author t_hara
 */
public class Client {

    public static void main(String[] args) {

        RaidBossWorld world = new RaidBossWorld();

        world.addService(EncountingRaidBossEvent.class, new EncountingRaidBossService());

        world.addStartRaidBattleListener(new Listener<RaidBattle>() {
            public void notify(RaidBattle raidBattle) {
                RaidBoss raidBoss = raidBattle.getRaidBoss();
                System.out.println("Encount " + raidBoss.getName() + "!");
                System.out.println("His hitpoint is " + raidBoss.getHitPoint());
            }
        });

        RaidBossFeature feature = new RaidBossFeature("c0hama", new BigDecimal("10000000"));
        Player player = new Player(1, new RaidBattleHistory(), new BigDecimal("100"));
        Event event = new EncountingRaidBossEvent(feature, player, 1000);
        world.fireEvent(event);
    }
}
