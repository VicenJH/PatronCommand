package co.edu.uniquindio.edu.poo.codigocommand;

public class Control {
    private Command command;

    //get and set
    public Command getCommand() {
        return command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }

    //metodo de conduccion de acciones para lo visual
    public void presionarBoton(){
        command.execute();
    }
}
