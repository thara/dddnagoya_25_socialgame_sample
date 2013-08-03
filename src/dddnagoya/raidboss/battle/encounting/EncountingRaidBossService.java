package dddnagoya.raidboss.battle.encounting;

import dddnagoya.raidboss.*;
import dddnagoya.raidboss.battle.RaidBattle;
import dddnagoya.raidboss.battle.RaidBoss;
import dddnagoya.raidboss.battle.RaidBossFeature;

import java.util.Calendar;

/**
 * @author t_hara
 */
public class EncountingRaidBossService implements Service<EncountingRaidBossEvent> {

    public RaidBattle startBattle(EncountingRaidBossEvent event) {
        
        RaidBossFeature feature = event.getFeature();

        Player player = event.getPlayer();
        RaidBoss raidBoss = feature.createRaidBoss(player.getHistory());
        
        Calendar startTime = Calendar.getInstance();
        long battleDuration = event.getBattleDuration();
        
        return new RaidBattle(raidBoss, startTime, battleDuration, player);
    }

    /* (non-Javadoc)
     * @see dddnagoya.raidboss.Service#handle(dddnagoya.raidboss.Event, dddnagoya.raidboss.RaidBossWorld)
     */
    public void handle(EncountingRaidBossEvent event,
            RaidBossWorld raidBossWorld) {
        RaidBattle newBattle = startBattle(event);
        raidBossWorld.addRaidBattle(newBattle);
    }
}
