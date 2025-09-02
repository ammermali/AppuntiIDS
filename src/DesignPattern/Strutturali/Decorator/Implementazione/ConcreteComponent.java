package DesignPattern.Strutturali.Decorator.Implementazione;
/** Classe dell'oggetto che andrà wrappato.
 */

class ConcreteComponent implements Component {
    // definizione del comportamento base
    @Override
    public void execute() {
        System.out.println(this);
    }
}
