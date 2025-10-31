package co.edu.uniquindio.edu.poo.codigocommand;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label statusLabel;

    private Luz luz;
    private TV tv;
    private Control control;
    private Command prenderCommand;
    private Command apagarCommand;
    private Command prenderCommand1;
    private Command apagarCommand1;

    @FXML
    public void initialize() {
        // Configuramos los objetos del patrón Command
        luz = new Luz(statusLabel);
        control = new Control();
        prenderCommand = new PrenderLuzCommand(luz);
        apagarCommand = new ApagarLuzCommand(luz);

        tv = new TV(statusLabel);
        control = new Control();
        prenderCommand1 = new PrenderTVCommand(tv);
        apagarCommand1 = new ApagarTVCommand(tv);
    }


    //botón prender la Luz
    @FXML
    private void onPrenderLuz() {
        control.setCommand(prenderCommand);
        control.presionarBoton();
    }
    //botón apagar la Luz
    @FXML
    private void onApagarLuz() {
        control.setCommand(apagarCommand);
        control.presionarBoton();
    }
    //botón prender la TV
    @FXML
    private void onPrenderTV() {
        control.setCommand(prenderCommand1);
        control.presionarBoton();
    }
    //botón apagar la TV
    @FXML
    private void onApagarTV() {
        control.setCommand(apagarCommand1);
        control.presionarBoton();
    }
}
