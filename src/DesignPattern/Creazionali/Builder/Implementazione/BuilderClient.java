package DesignPattern.Creazionali.Builder.Implementazione;

 class BuilderClient {
     static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

        director.constructProductA(concreteBuilder1);
        Product1 A1 = concreteBuilder1.getResult();
        director.constructProductB(concreteBuilder1);
        Product1 B1 = concreteBuilder1.getResult();
        director.constructProductC(concreteBuilder1);
        Product1 C1 = concreteBuilder1.getResult();
        director.constructProductA(concreteBuilder2);
        Product2 A2 = concreteBuilder2.getResult();
        director.constructProductB(concreteBuilder2);
        Product2 B2 = concreteBuilder2.getResult();
        director.constructProductC(concreteBuilder2);
        Product2 C2 = concreteBuilder2.getResult();

        A1.doStuff();
        B1.doStuff();
        C1.doStuff();
        A2.doStuff();
        B2.doStuff();
        C2.doStuff();
    }
}
