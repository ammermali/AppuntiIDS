package DesignPattern.Strutturali.Decorator.Implementazione;

/** Contiene il riferimento all'oggetto wrappato.
 */

class BaseDecorator implements Component{
    private Component wrappee;

    BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
