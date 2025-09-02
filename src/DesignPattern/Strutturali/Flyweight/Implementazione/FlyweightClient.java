package DesignPattern.Strutturali.Flyweight.Implementazione;

class FlyweightClient {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Context c1 = new Context(1, 100, factory);
        Context c2 = new Context(2, 200, factory);
        Context c3 = new Context(1, 300, factory);
        Context c4 = new Context(2, 400, factory);
        Context c5 = new Context(3, 500, factory);

        c1.operation();
        c2.operation();
        c3.operation();
        c4.operation();
        c5.operation();
    }
}
