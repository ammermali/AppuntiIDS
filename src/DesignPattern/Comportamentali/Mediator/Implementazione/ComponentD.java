package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Componente generica che deve collaborate con le altre.
 * Conosce il Mediator ma non conosce le altre componenti con cui è connesso.
 */
class ComponentD {
    private Mediator mediator;

    ComponentD() {}

    // metodo per comunicare col mediator
    void send(){
        mediator.notify("D");
    }

    // operazioni generiche
    void operationD(){
        System.out.println(this);
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
