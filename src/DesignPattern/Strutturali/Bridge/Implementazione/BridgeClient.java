package DesignPattern.Strutturali.Bridge.Implementazione;

public class BridgeClient {
    public static void main(String[] args) {
        ConcreteImplementation implementation = new ConcreteImplementation();
        Abstraction abstraction = new Abstraction(implementation);
        abstraction.feature1();
        abstraction.feature2();
    }
}
