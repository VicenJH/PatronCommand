package co.edu.uniquindio.edu.poo.codigocommand;
/**
 * Comando concreto que apaga una TV.
 * Implementa la interfaz Command y delega la acción al receptor TV.
 */
public class ApagarTVCommand implements Command{
    private TV tv;

    public ApagarTVCommand(TV tv){
        this.tv = tv;
    }
    /** Ejecuta la acción de apagar la TV */
    @Override
    public void execute(){
        tv.apagar();
    }
}
