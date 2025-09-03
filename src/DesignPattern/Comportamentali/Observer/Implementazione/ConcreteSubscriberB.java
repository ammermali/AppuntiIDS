package DesignPattern.Comportamentali.Observer.Implementazione;

class ConcreteSubscriberB implements Subscriber {
    private int state;

    ConcreteSubscriberB(int state){
        this.state = state;
    }

    int getState(){
        return state;
    }

    @Override
    public void update(Publisher publisher) {
        state = (state + publisher.getState());
    }
}
