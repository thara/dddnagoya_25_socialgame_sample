package dddnagoya.raidboss;

import dddnagoya.raidboss.battle.RaidBattle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author t_hara
 */
public class RaidBossWorld {

    private Map<Class<? extends Event>, Service<? extends Event>> services =
            new HashMap<Class<? extends Event>, Service<? extends Event>>();
    
    public <E extends Event> void addService(Class<E> eventType, Service<E> service) {
        services.put(eventType, service);
    }
    
    private Listener<RaidBattle> startRaidBattleListener;
    
    /**
     * @param event
     */
    public <E extends Event> void fireEvent(E event) {
        @SuppressWarnings("unchecked")
        Service<E> serivce = (Service<E>) services.get(event.getClass());
        serivce.handle(event, this);
    }
    
    public void addRaidBattle(RaidBattle raidBattle) {
        startRaidBattleListener.notify(raidBattle);
    }
    
    /**
     * @param startRaidBattleListener the startRaidBattleListener to set
     */
    public void addStartRaidBattleListener(
            Listener<RaidBattle> startRaidBattleListener) {
        this.startRaidBattleListener = startRaidBattleListener;
    }
}
