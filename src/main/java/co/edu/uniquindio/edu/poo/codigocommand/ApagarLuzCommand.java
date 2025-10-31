package co.edu.uniquindio.edu.poo.codigocommand;

/**
 * Comando concreto que apaga una luz.
 * Implementa la interfaz Command y delega la acción al receptor Luz.
 */
public class ApagarLuzCommand implements Command {
    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    /** Ejecuta la acción de apagar la luz */
    @Override
    public void execute() {
        luz.apagar();
    }
}