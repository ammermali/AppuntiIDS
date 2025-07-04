package DesignPattern.Creazionali.Factory;

public class ConcreteCreatorB extends Creator{

    @Override
    public Product createProduct() {
        // logic
        return new ConcreteProductB();
    }
}
