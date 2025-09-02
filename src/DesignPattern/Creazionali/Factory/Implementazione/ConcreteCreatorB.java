package DesignPattern.Creazionali.Factory.Implementazione;

public class ConcreteCreatorB extends Creator{

    @Override
    public Product createProduct() {
        // logic
        return new ConcreteProductB();
    }
}
