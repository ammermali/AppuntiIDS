package DesignPattern.Strutturali.Bridge.Implementazione;

/** Classe che fornisce le logiche di controllo di alto livello.
 */
public class Abstraction {
    private Implementation i; // aggregazione

    // il costruttore non è necessario
    public Abstraction(Implementation i) {
        this.i = i;
    }

    public void feature1(){
        i.method1();
    }

    public void feature2(){
        i.method2();
    }
}
