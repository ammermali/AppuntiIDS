package DesignPattern.Comportamentali.Template.Implementazione;

class TemplateClient {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        ConcreteClassB concreteClassB = new ConcreteClassB();
        ConcreteClassBase concreteClassBase = new ConcreteClassBase();

        System.out.println(concreteClassA.templateMethod(10));
        System.out.println(concreteClassB.templateMethod(10));
        System.out.println(concreteClassBase.templateMethod(10));
    }
}
