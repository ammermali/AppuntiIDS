package DesignPattern.Comportamentali.State.Implementazione;

class ConcreteStateA implements State{
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void feature1() {
        System.out.println("ConcreteStateA feature1");
    }

    @Override
    public void feature2(int attribute) {
        System.out.println("ConcreteStateA feature2 " + attribute);
    }
}
