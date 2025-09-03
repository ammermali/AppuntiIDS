package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

public class ConcreteHandlerA extends BaseHandler{
    @Override
    public void handle(String request) {
        System.out.println("ConcreteHandlerA");
        if(request.startsWith("A")){
            System.out.println("Richiesta accettata");
        }else{
            super.handle(request);
        }
    }
}
