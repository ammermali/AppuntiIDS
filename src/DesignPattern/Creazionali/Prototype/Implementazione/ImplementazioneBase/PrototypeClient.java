package DesignPattern.Creazionali.Prototype.Implementazione.ImplementazioneBase;

public class PrototypeClient {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("1");
        Prototype prototype2 = new ConcretePrototype((ConcretePrototype) prototype);
        Prototype prototype3 = new SubclassPrototype("1", "2");
        Prototype prototype4 = new SubclassPrototype((SubclassPrototype) prototype3);

        ((ConcretePrototype) prototype).doStuff();
        ((ConcretePrototype) prototype2).doStuff();
        ((SubclassPrototype) prototype3).doStuff();
        ((SubclassPrototype) prototype4).doStuff();
    }
}
