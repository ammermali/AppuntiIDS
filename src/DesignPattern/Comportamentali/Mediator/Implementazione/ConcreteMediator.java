package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Definizione della business logic del Mediator.
 */

class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private ComponentD componentD;

    ConcreteMediator(ComponentA componentA, ComponentB componentB, ComponentC componentC, ComponentD componentD) {
        this.componentA = componentA;
        this.componentB = componentB;
        this.componentC = componentC;
        this.componentD = componentD;
        componentA.setMediator(this);
        componentB.setMediator(this);
        componentC.setMediator(this);
        componentD.setMediator(this);
    }

    @Override
    public void notify(String sender) {
        if(sender.equals("A")) reactOnA();
        if(sender.equals("B")) reactOnB();
        if(sender.equals("C")) reactOnC();
        if(sender.equals("D")) reactOnD();
    }

    void reactOnA() {
        componentB.operationB();
        componentC.operationC();
        componentD.operationD();
    }

    void reactOnB() {
        componentA.operationA();
        componentC.operationC();
        componentD.operationD();
    }

    void reactOnC() {
        componentA.operationA();
        componentB.operationB();
        componentD.operationD();
    }

    void reactOnD() {
        componentA.operationA();
        componentB.operationB();
        componentC.operationC();
    }
}
