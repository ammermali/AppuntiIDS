package DesignPattern.Comportamentali.State.Implementazione;

/** Tiene conto dell'attuale stato e permette di cambiarlo.
 */

class Context {
    private State state;

    Context(State state) {
        this.state = state;
    }

    void changeState(State state) {
        this.state = state;
        state.setContext(this);
    }

    void feature1(){
        state.feature1();
    }

    void feature2(int attribute){
        state.feature2(attribute);
    }
}
