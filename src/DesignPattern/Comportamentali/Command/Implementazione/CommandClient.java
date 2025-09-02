package DesignPattern.Comportamentali.Command.Implementazione;

class CommandClient {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand1(receiver, 2, 3);
        Command command2 = new ConcreteCommand2(receiver, 2, 3);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        invoker.setCommand(command2);
        invoker.executeCommand();
    }
}
