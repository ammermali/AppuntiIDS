package DesignPattern.Comportamentali.State.Implementazione;

class ConcreteStateB implements State{
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void feature1() {
        System.out.println("Passando a Stato A");
        // passa allo stato A
        State state = new ConcreteStateA();
        context.changeState(state);
    }

    @Override
    public void feature2(int attribute) {
        System.out.println("ConcreteStateB feature2 " + attribute);
    }
}
