package DesignPattern.Comportamentali.Memento.Implementazione;

/** Classe generica.
 * Può salvare il suo stato in degli snapshot e ripristinarlo.
 */

class Originator {
    // attributo generico rappresentante lo stato
    private int state;

    // classe interna
    // i Memento devono rimanere invariati una volta costruiti
    // potrebbero quindi essere sostituiti da records
    final class Memento {
        private final int state;

        Memento(int state) {this.state = state;}
        int getState() { return state; }
    }

    Memento save(){
        return new Memento(state);
    }

    void restore(Memento memento){
        this.state = memento.getState();
    }

    void changeState(int newState){
        this.state = newState;
    }

    void printState(){
        System.out.println(state);
    }
}
