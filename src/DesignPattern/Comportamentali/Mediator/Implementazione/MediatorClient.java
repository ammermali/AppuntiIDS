package DesignPattern.Comportamentali.Mediator.Implementazione;

class MediatorClient {
    public static void main(String[] args) {
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        ComponentC componentC = new ComponentC();
        ComponentD componentD = new ComponentD();
        ConcreteMediator mediator = new ConcreteMediator(componentA, componentB, componentC, componentD);

        System.out.println("Component A:");
        componentA.send();
        System.out.println("Component B:");
        componentB.send();
        System.out.println("Component C:");
        componentC.send();
        System.out.println("Component D:");
        componentD.send();
    }
}
