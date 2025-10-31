package co.edu.uniquindio.edu.poo.codigocommand;
/**
 * Comando concreto que prende/enciende una TV.
 * Implementa la interfaz Command y delega la acción al receptor TV.
 */
public class PrenderTVCommand implements Command{
    private TV tv;

    public PrenderTVCommand(TV tv){
        this.tv=tv;
    }
    /** Ejecuta la acción de PRENDER/PRENDER la TV */
    @Override
    public void execute(){
        tv.prender();
    }

}
