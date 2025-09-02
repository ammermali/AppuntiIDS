package DesignPattern.Strutturali.Composite.Implementazione;

 class CompositeClient {
     static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();

        Container container1 = new Container();
        container1.add(leaf1);
        container1.add(leaf2);
        Container container2 = new Container();
        container2.add(container1);
        container2.add(leaf3);

        container2.execute();
    }
}
