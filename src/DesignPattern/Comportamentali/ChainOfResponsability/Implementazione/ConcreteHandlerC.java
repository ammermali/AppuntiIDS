package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

class ConcreteHandlerC extends BaseHandler{
    @Override
    public void handle(String request) {
        System.out.println("ConcreteHandlerC");
        if(request.startsWith("C")){
            System.out.println("Richiesta accettata");
        }else{
            super.handle(request);
        }
    }
}
