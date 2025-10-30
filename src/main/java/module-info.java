module co.edu.uniquindio.edu.poo.codigocommand {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.edu.poo.codigocommand to javafx.fxml;
    exports co.edu.uniquindio.edu.poo.codigocommand;
}