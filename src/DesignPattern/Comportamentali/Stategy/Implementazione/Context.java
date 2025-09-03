package DesignPattern.Comportamentali.Stategy.Implementazione;

class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomething(int attribute){
        // esegue la strategia con strategy.attribute
        System.out.println(strategy.execute(attribute));
    }
}
