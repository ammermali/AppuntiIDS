package DesignPattern.Comportamentali.Iterator.Implementazione;

/** Interfaccia che dichiara gli operatori richiesti per attraversare una Collection.
 */

interface Iterator<T> {
    boolean hasMore();
    T getNext();
}
