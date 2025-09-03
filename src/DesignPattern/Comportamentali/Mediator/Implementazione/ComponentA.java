package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Componente generica che deve collaborate con le altre.
 * Conosce il Mediator ma non conosce le altre componenti con cui è connesso.
 */
class ComponentA {
    private Mediator mediator;

    ComponentA() {}

    // metodo per comunicare col mediator
    void send(){
        mediator.notify("A");
    }

    // operazioni generiche
    void operationA(){
        System.out.println(this);
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
