package co.edu.uniquindio.edu.poo.codigocommand;
import javafx.scene.control.Label;

public class Luz {
    private Label statusLabel;
    public Luz(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    public void prender(){
        System.out.println("LA LUZ SE HA ENCENDIDO ");
    }
    public void apagar(){
        System.out.println("LA LUZ SE HA APAGADO ");
    }
}
