package DesignPattern.Comportamentali.Template.Implementazione;

/** Può modificare i passaggi del Template attraverso il meccanismo dell'Override.
 */

class ConcreteClassA extends AbstractClass {
    @Override
    boolean step2(int a){
        return (a < 0);
    }
}
