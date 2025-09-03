package DesignPattern.Comportamentali.Stategy.Implementazione;

class ConcreteStrategyB implements Strategy {
    @Override
    public int execute(int data) {
        // implementazione algoritmo
        System.out.println("ConcreteStrategyB");
        return data - 2;
    }
}
