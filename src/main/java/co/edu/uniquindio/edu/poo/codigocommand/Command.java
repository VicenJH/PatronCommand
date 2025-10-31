package co.edu.uniquindio.edu.poo.codigocommand;

/**
 * Interfaz base del patrón Command.
 * Define el método execute(), que ejecuta una acción específica.
 *
 * Cada comando concreto implementará este método según su funcionalidad.
 */
public interface Command {
    /**
     * Ejecuta la acción asociada al comando.
     */
    void execute();
}