package DesignPattern.Comportamentali.ChainOfResponsability.Implementazione;

/** In genere contiene un solo metodo per gestire le richieste.
 * A volte può avere un altro metodo per inserire l'handler successivo.
 */

interface Handler {
    void setNext(Handler next);
    void handle(String request);
}
