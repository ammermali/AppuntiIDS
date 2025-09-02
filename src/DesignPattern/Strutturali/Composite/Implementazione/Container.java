package DesignPattern.Strutturali.Composite.Implementazione;
import java.util.ArrayList;

/** Classe che rappresenta un elemento con sotto-elementi.
 * Non conosce le classi concrete dei figli.
 */

public class Container implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    // tutto il lavoro viene delegato ai nodi figli
    @Override
    public void execute() {
        for (Component child : children) {
            child.execute();
        }
    }

    // aggiungi un componente a questo componente
    public void add(Component component){
        children.add(component);
    }

    // rimuovi un componente da questo componente
    public void remove(Component component){
        children.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return children;
    }

}
