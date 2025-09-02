package DesignPattern.Strutturali.Flyweight.Implementazione;

/** Contiene lo stato intrinseco ed implementa le operazioni.
 */
class Flyweight {
    private final int repeatingState;

    Flyweight(int state) {
        repeatingState = state;
    }

    void operation(int uniqueState){
        System.out.println(uniqueState + " " + repeatingState);
    }
}
