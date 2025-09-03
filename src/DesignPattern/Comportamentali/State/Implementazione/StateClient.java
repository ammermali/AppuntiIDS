package DesignPattern.Comportamentali.State.Implementazione;

class StateClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.feature1();
        context.feature2(2);
        context.changeState(new ConcreteStateB());
        context.feature2(5);
        context.feature1();
        context.feature1();
    }
}
