package co.edu.uniquindio.edu.poo.codigocommand;
import javafx.scene.control.Label;

public class TV {
    private Label statusLabel;

    public TV(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    public void prender(){
        System.out.println("LA TV SE HA ENCENDIDO ");
    }
    public void apagar(){
        System.out.println("LA TV SE HA APAGADO ");
    }
}
