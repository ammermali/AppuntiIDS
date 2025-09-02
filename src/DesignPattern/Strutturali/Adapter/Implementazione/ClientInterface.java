package DesignPattern.Strutturali.Adapter.Implementazione;

/** Interfaccia che descrive il protocollo a cui le altre classi
 *  devono essere adattate per collaborare col client.
 */

public interface ClientInterface {
    String method(String data);
}
