package DesignPattern.Creazionali.Factory.Implementazione;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        // logic
        return new ConcreteProductA();
    }
}
