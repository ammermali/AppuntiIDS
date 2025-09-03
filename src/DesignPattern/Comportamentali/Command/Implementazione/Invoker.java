package DesignPattern.Comportamentali.Command.Implementazione;

/** La classe Invoker ha la responsabilità di inizializzare le richieste.
 */

class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
