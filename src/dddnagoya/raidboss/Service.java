package dddnagoya.raidboss;

/**
 * @author t_hara
 */
public interface Service<E extends Event> {

    void handle(E event, RaidBossWorld raidBossWorld);
}
