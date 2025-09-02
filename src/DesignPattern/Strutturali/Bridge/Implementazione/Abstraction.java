package DesignPattern.Strutturali.Bridge.Implementazione;

/** Classe che fornisce le logiche di controllo di alto livello.
 */
 class Abstraction {
    private Implementation i; // aggregazione

    // il costruttore non è necessario
     Abstraction(Implementation i) {
        this.i = i;
    }

     void feature1(){
        i.method1();
    }

     void feature2(){
        i.method2();
    }
}
