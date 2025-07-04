package DesignPattern.Creazionali.Factory;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        // logic
        return new ConcreteProductA();
    }
}
