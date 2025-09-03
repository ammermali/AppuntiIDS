package DesignPattern.Comportamentali.Mediator.Implementazione;

/** Interfaccia che descrive come i mediator comunicano con le componenti (e viceversa).
 */
interface Mediator {
    // a seconda della scelta di implementazione, qui potrebbe essere usata alternativamente
    // un'interfaccia comune a tutte le componenti
    void notify(String sender);
}
