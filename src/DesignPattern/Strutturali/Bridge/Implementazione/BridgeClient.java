package DesignPattern.Strutturali.Bridge.Implementazione;

 class BridgeClient {
     static void main(String[] args) {
        ConcreteImplementation implementation = new ConcreteImplementation();
        Abstraction abstraction = new Abstraction(implementation);
        abstraction.feature1();
        abstraction.feature2();
    }
}
