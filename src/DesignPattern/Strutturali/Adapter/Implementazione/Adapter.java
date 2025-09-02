package DesignPattern.Strutturali.Adapter.Implementazione;

/** Classe che traduce il Service così da poter collaborare col Client.
 *  Riceve chiamate dal ObjectAdapterClient, esegue chiamate a Service e restituisce il risultato tradotto
 *  al ObjectAdapterClient.
 */
public class Adapter implements ClientInterface{
    // Servizio da adattare (qui instanziato)
    private Service adaptee = new Service();

    @Override
    public String method(String data) {
        String specialData = convertToServiceFormat(data);
        return adaptee.serviceMethod(specialData);
    }

    /** Metodo ausiliario per la conversione dei dati nel formato previsto dal Service
     */
    private String convertToServiceFormat(String data){
        // DO SOMETHING
        String specialData = data;
        return specialData;
    }
}
