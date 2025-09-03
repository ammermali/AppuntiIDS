package DesignPattern.Comportamentali.Memento.Implementazione;

class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.changeState(10);
        Caretaker caretaker = new Caretaker(originator);
        caretaker.save();
        originator.changeState(20);
        caretaker.save();
        originator.changeState(30); // NB nell'implementazione effettiva, queste funzioni andrebbero implementate nel caretaker
        caretaker.save();
        originator.printState();
        originator.changeState(40);
        caretaker.undo();
        caretaker.undo();
        originator.printState();
    }
}
