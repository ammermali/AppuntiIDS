package DesignPattern.Comportamentali.State.Implementazione;

/** Descrive i metodi degli stati.
 */

interface State {
    void setContext(Context context);
    void feature1();
    void feature2(int attribute);
}
