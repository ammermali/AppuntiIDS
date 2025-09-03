package DesignPattern.Comportamentali.Stategy.Implementazione;

class ConcreteStrategyA implements Strategy {
    @Override
    public int execute(int data) {
        // implementazione algoritmo
        System.out.println("ConcreteStrategyA");
        return data/2;
    }
}
