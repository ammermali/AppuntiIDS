package DesignPattern.Creazionali.Builder.Implementazione;

class Product2 {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;

    Product2(String attribute1, String attribute2, String attribute3, String attribute4) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
    }

     void doStuff(){
        System.out.println("Product 2 \n Attribute 1: " + attribute1 + "\n Attribute 2: " + attribute2 + "\n Attribute 3: " + attribute3 + "\n Attribute 4: " + attribute4);
    }
}
