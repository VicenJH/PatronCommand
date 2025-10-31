package co.edu.uniquindio.edu.poo.codigocommand;
/**
 * Comando concreto que prende/enciende una luz.
 * Implementa la interfaz Command y delega la acción al receptor Luz.
 */
public class PrenderLuzCommand implements Command{
    private Luz luz;
    public PrenderLuzCommand(Luz luz){
        this.luz = luz;
    }
    /** Ejecuta la acción de PRENDER/ENCENDER la luz */
    @Override
    public void execute(){
        luz.prender();
    }

}
