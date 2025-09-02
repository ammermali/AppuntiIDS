package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

/** BaseHandler è una classe opzionale.
 * Raccoglie tutto il codice comune a tutti gli handler.
 */
abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        // logica per gestire la richiesta
        // se questo handler non riesce a gestirla, la passa all'handler successivo
        if(next != null){
            next.handle(request);
        }
    }
}
