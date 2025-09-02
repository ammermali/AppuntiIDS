package DesignPattern.Creazionali.Singleton.Implementazione;

 class Singleton {
    private static Singleton instance;
    private Singleton() {}

     static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

     void doStuff(){
        System.out.println("Singleton doStuff");
    }
}
