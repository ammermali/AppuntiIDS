package DesignPattern.Comportamentali.Command.Implementazione;

/** Classe in cui è contenuta l'effettiva business logic.
 */
class Receiver {
    void operation(int a, int b){
        System.out.println(a + " " + b);
    }
}
