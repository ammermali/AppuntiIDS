package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Componente generica che deve collaborate con le altre.
 * Conosce il Mediator ma non conosce le altre componenti con cui è connesso.
 */
class ComponentC {
    private Mediator mediator;

    ComponentC() {}

    // metodo per comunicare col mediator
    void send(){
        mediator.notify("C");
    }

    // operazioni generiche
    void operationC(){
        System.out.println(this);
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
