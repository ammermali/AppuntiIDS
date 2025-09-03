package DesignPattern.Comportamentali.Memento.Implementazione;
import java.util.Stack;

/** Classe che gestisce le logiche di salvataggio e ripristino.
 */

class Caretaker {
    private Originator originator;
    private Stack<Originator.Memento> history = new Stack<>();

    Caretaker(Originator originator) {
        this.originator = originator;
    }

    void undo(){
        Originator.Memento m = history.pop();
        originator.restore(m);
    }

    void save(){
        Originator.Memento m = originator.save();
        history.push(m);
    }
}
