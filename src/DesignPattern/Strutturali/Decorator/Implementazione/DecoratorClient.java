package DesignPattern.Strutturali.Decorator.Implementazione;

 class DecoratorClient {
     static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorators decorator = new ConcreteDecorators(component);
        ConcreteDecorators decorator2 = new ConcreteDecorators(decorator);

        decorator2.execute();
        
    }
}
