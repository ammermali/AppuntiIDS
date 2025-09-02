package DesignPattern.Creazionali.Builder.Implementazione;

public class ConcreteBuilder1 implements Builder{
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;

    @Override
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public Product1 getResult(){
        return new Product1(attribute1, attribute2, attribute3, attribute4);
    }
}
