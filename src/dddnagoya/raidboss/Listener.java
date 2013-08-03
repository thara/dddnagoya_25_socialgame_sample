package dddnagoya.raidboss;

/**
 * @author t_hara
 */
public interface Listener<E> {

    void notify(E target);
}
