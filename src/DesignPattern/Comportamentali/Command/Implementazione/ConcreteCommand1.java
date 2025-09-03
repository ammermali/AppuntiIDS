package DesignPattern.Comportamentali.Command.Implementazione;

class ConcreteCommand1 implements Command {
    private final Receiver receiver;
    private final int attribute1, attribute2;

    ConcreteCommand1(Receiver receiver, int attribute1, int attribute2) {
        this.receiver = receiver;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    @Override
    public void execute() {
        receiver.operation(attribute1, attribute2);
    }
}
