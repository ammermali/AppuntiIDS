package DesignPattern.Creazionali.Prototype.ImplementazioneBase;

public class SubclassPrototype extends ConcretePrototype {
    private String field2;

    public SubclassPrototype(String field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    public SubclassPrototype(SubclassPrototype prototype){
        super(prototype);
        this.field2 = prototype.field2;
    }

    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }

    public void doStuff(){
        System.out.println("SubclassPrototype doStuff " + field2);
    }
}
