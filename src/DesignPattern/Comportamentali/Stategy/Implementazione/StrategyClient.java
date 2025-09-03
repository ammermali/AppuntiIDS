package DesignPattern.Comportamentali.Stategy.Implementazione;

class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.doSomething(10);
        context.setStrategy(new ConcreteStrategyB());
        context.doSomething(20);
    }
}
