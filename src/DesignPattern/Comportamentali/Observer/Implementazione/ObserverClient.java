package DesignPattern.Comportamentali.Observer.Implementazione;

class ObserverClient {
    public static void main(String[] args) {
        ConcreteSubscriberA subA = new ConcreteSubscriberA(10);
        ConcreteSubscriberB subB = new ConcreteSubscriberB(10);
        Publisher publisher = new Publisher(2);
        publisher.subscribe(subA);
        publisher.subscribe(subB);
        System.out.println(subA.getState());
        System.out.println(subB.getState());
        publisher.changeState(5);
        System.out.println(subA.getState());
        System.out.println(subB.getState());
    }
}
