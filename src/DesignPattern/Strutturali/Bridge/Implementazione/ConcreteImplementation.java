package DesignPattern.Strutturali.Bridge.Implementazione;

 class ConcreteImplementation implements Implementation{
    @Override
    public void method1() {
        System.out.println("Metodo1");
    }

    @Override
    public void method2() {
        System.out.println("Metodo2");
    }
}
