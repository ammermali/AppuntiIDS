package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Componente generica che deve collaborate con le altre.
 * Conosce il Mediator ma non conosce le altre componenti con cui è connesso.
 */
class ComponentB {
    private Mediator mediator;

    ComponentB() {}

    // metodo per comunicare col mediator
    void send(){
        mediator.notify("B");
    }

    // operazioni generiche
    void operationB(){
        System.out.println(this);
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
