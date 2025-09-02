package DesignPattern.Strutturali.Proxy.Implementazione;

/** Classe generica che simula un servizio.
 */

class Service implements ServiceInterface {
   Service(){}


    @Override
    public void operation() {
        System.out.println("Operation succeded");
    }
}
