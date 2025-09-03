package DesignPattern.Comportamentali.Iterator.Implementazione;

class ConcreteCollection<T> implements IterableCollection {

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<T>(this);
    }
}
