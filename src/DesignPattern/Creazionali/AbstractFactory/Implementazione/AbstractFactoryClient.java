package DesignPattern.Creazionali.AbstractFactory.Implementazione;

 class AbstractFactoryClient {
     static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA1 = factory1.createProductA();
        ProductA productA2 = factory2.createProductA();
        ProductB productB1 = factory1.createProductB();
        ProductB productB2 = factory2.createProductB();

        productA1.doStuff();
        productA2.doStuff();
        productB1.doStuff();
        productB2.doStuff();
    }
}
