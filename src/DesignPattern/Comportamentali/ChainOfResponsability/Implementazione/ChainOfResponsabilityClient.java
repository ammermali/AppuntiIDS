package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

class ChainOfResponsabilityClient {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        handlerA.handle("C10");
        handlerA.handle("B30");
        handlerA.handle("A14");
    }
}
