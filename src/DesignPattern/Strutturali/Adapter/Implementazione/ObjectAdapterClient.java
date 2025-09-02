package DesignPattern.Strutturali.Adapter.Implementazione;

/** Implementazione dell'Adapter, variante Object Adapter.
 *  Il client collabora direttamente col service attraverso l'Adapter.
 *  La variante Class Adapter, in cui l'Adapter traduce il Service in una classe del sistema,
 *  non è implementabile in Java perché non permette la doppia-ereditarietà.
 */
public class ObjectAdapterClient {
    public static void main(String[] args) {
        ClientInterface clientInterface = new Adapter();
        System.out.println(clientInterface.method("dati"));
    }
}
