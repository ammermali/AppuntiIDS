package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

class ConcreteHandlerB extends BaseHandler{
    @Override
    public void handle(String request) {
        System.out.println("ConcreteHandlerB");
        if(request.startsWith("B")){
            System.out.println("Richiesta accettata");
        }else{
            super.handle(request);
        }
    }
}
