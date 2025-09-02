package DesignPattern.Creazionali.Factory.Implementazione;

 class ConcreteCreatorA extends Creator {

    @Override
     Product createProduct() {
        // logic
        return new ConcreteProductA();
    }
}
