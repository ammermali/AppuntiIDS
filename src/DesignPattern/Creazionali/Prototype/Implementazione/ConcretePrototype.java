package DesignPattern.Creazionali.Prototype.Implementazione;

 class ConcretePrototype implements Prototype {
    private String field1;

     ConcretePrototype(String field1) {
        this.field1 = field1;
    }

     ConcretePrototype(ConcretePrototype prototype) {
        this.field1 = prototype.field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

     void doStuff(){
        System.out.println("ConcretePrototype doStuff " + field1);
    }
}
