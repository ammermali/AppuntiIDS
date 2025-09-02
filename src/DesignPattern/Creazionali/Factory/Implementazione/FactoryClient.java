package DesignPattern.Creazionali.Factory.Implementazione;

class FactoryClient{
     static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Creator creator2 = new ConcreteCreatorB();

        Product product = creator.createProduct();
        Product product2 = creator2.createProduct();

        product.doStuff();
        product2.doStuff();
    }
}