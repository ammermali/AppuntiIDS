package DesignPattern.Strutturali.Composite.Implementazione;

/** Elemento base.
 */
public class Leaf implements Component {

    @Override
    public void execute() {
        System.out.println(this);
    }
}
