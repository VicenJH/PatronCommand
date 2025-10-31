package co.edu.uniquindio.edu.poo.codigocommand;
import javafx.scene.control.Label;

/**
 * Clase que representa un televisor controlable.
 * También actúa como receptor dentro del patrón Command.
 */
public class TV {
    private Label statusLabel;

    public TV(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    /** Enciende la TV */
    public void prender() {
        System.out.println("LA TV SE HA ENCENDIDO");
    }

    /** Apaga la TV */
    public void apagar() {
        System.out.println("LA TV SE HA APAGADO");
    }
}