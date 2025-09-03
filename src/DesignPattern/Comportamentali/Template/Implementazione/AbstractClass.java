package DesignPattern.Comportamentali.Template.Implementazione;

/** Definisce lo scheletro dell'algoritmo, definendo come metodi i singoli step.
 */

abstract class AbstractClass {
    int templateMethod(int attribute){
        attribute = step1(attribute);
        if(step2(attribute)) return step3(attribute);
        return step4(attribute);
    }

    // implementazione di default dei passaggi
    int step1(int attribute){
        return attribute+3;
    }
    boolean step2(int attribute){
        return attribute > 10;
    }
    int step3(int attribute){
        return attribute/10;
    }
    int step4(int attribute){
        return attribute * 10;
    }
}
