package DesignPattern.Comportamentali.Observer.Implementazione;

class ConcreteSubscriberA implements Subscriber{
    private int state;

    ConcreteSubscriberA(int state){
        this.state = state;
    }

    int getState(){
        return state;
    }

    @Override
    public void update(Publisher publisher) {
        state = (state - publisher.getState());
    }
}
