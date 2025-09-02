package DesignPattern.Strutturali.Decorator.Implementazione;

/** Definisce comportamenti extra
 *
 */

class ConcreteDecorators extends BaseDecorator {
    ConcreteDecorators(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        extra();
        super.execute();
    }

    // comportamenti extra
    void extra(){
        System.out.println("Funzioni extra");
    }
}
