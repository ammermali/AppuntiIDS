package DesignPattern.Strutturali.Flyweight.Implementazione;
import java.util.HashMap;
import java.util.Map;

/** Gestisce una serie di flyweight già esistenti.
 * Sarebbe possibile realizzarlo come singleton,
 * in questa implementazione viene istanziato nel client e passato come parametro.
 */

class FlyweightFactory {
    private final Map<Integer, Flyweight> cache = new HashMap<>();

    // restituisce il Flyweight corrispondente allo stato passato,
    // se non esiste, lo crea
    Flyweight getFlyweight(int repeatingState) {
        return cache.computeIfAbsent(repeatingState, Flyweight::new);
    }
}
