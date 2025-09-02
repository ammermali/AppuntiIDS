package DesignPattern.Creazionali.Builder.Implementazione;

 class Director {
     Director() {
    }

     void constructProductA(Builder builder){
        builder.setAttribute1("A1");
        builder.setAttribute2("A2");
        builder.setAttribute3("A3");
        builder.setAttribute4("A4");
    }

     void constructProductB(Builder builder){
        builder.setAttribute1("B1");
        builder.setAttribute2("B2");
        builder.setAttribute3("B3");
        builder.setAttribute4("B4");
    }

     void constructProductC(Builder builder){
        builder.setAttribute1("C1");
        builder.setAttribute2("C2");
        builder.setAttribute3("C3");
        builder.setAttribute4("C4");
    }

}
