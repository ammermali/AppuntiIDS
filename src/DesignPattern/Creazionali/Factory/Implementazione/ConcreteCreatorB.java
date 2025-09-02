package DesignPattern.Creazionali.Factory.Implementazione;

 class ConcreteCreatorB extends Creator{

    @Override
     Product createProduct() {
        // logic
        return new ConcreteProductB();
    }
}
