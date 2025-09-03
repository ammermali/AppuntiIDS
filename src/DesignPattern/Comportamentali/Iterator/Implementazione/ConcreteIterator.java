package DesignPattern.Comportamentali.Iterator.Implementazione;

/** Implementa gli algoritmi specifici per attraversare una collezione.
 */

class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteCollection collection;
    private int iterationState;

    ConcreteIterator(ConcreteCollection collection){
        this.collection = collection;
    }

    @Override
    public boolean hasMore(){
        // logica per valutare se ci sono altri elementi
        return true;
    }

    @Override
    public T getNext(){
        // logica per restituire il successivo
        return null;
    }
}
