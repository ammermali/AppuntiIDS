package DesignPattern.Comportamentali.Observer.Implementazione;
import java.util.ArrayList;
import java.util.concurrent.Flow;

/** Il Publisher ha il compito di segnalare agli osservatori quando accade un evento.
 * Un evento può essere un cambio di stato o l'esecuzione di un comportamento.
 */

class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    // int che "simula" lo stato dell'oggetto
    private int mainState;

    Publisher(int state){mainState = state;}

    void subscribe(Subscriber s){
        subscribers.add(s);
    }
    void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }
    void notifySubscribers(){
        for(Subscriber s : subscribers){
            s.update(this);
        }
    }

    // ulteriori logiche di business
    // non fanno strettamente parte del DP
    int getState(){ return mainState; }
    void changeState(int newState){
        mainState = newState;
        notifySubscribers();
    }
}
