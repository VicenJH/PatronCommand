package co.edu.uniquindio.edu.poo.codigocommand;

/**
 * Clase invocadora del patrón Command.
 * Representa un control remoto que puede ejecutar diferentes comandos.
 */
public class Control {
    private Command command;

    /** Asigna un comando al control */
    public void setCommand(Command command) {
        this.command = command;
    }

    /** Obtiene el comando actual */
    public Command getCommand() {
        return command;
    }

    /**
     * Simula la acción de presionar un botón del control remoto.
     * Ejecuta el comando actualmente asignado.
     */
    public void presionarBoton() {
        command.execute();
    }
}