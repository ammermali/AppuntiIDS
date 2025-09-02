package DesignPattern.Strutturali.Flyweight.Implementazione;

/** Contiene lo stato estrinseco.
 * Quando associato ad un oggetto Flyweight, restitusice lo stato originale.
 */

class Context {
    private final int uniqueState;
    private final Flyweight flyweight;

    Context(int repeatingState, int uniqueState, FlyweightFactory flyweightFactory) {
        this.uniqueState = uniqueState;
        this.flyweight = flyweightFactory.getFlyweight(repeatingState);
    }

    void operation(){
        flyweight.operation(uniqueState);
    }
}
