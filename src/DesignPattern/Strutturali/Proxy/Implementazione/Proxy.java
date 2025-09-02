package DesignPattern.Strutturali.Proxy.Implementazione;

/** Gestisce l'intero ciclo di vita di Service.
 */
class Proxy implements ServiceInterface {
    private Service realService;

    Proxy(Service realService){
        this.realService = realService;
    }

    boolean checkAccess(){
        // controlli vari
        return true;
    }

    public void operation(){
        if(checkAccess()){
            realService.operation();
        }
    }
}
