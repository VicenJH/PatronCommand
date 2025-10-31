package co.edu.uniquindio.edu.poo.codigocommand;
import javafx.scene.control.Label;

/**
 * Clase que representa una luz controlable.
 * Actúa como el receptor en el patrón Command.
 */
public class Luz {
    private Label statusLabel;

    public Luz(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    /** Enciende la luz */
    public void prender() {
        System.out.println("LA LUZ SE HA ENCENDIDO");
    }

    /** Apaga la luz */
    public void apagar() {
        System.out.println("LA LUZ SE HA APAGADO");
    }
}