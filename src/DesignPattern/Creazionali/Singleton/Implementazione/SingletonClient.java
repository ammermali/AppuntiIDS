package DesignPattern.Creazionali.Singleton.Implementazione;

 class SingletonClient {
     static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doStuff();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton.equals(singleton2));
    }
}
