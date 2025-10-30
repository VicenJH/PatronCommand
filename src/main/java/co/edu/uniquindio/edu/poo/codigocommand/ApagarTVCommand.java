package co.edu.uniquindio.edu.poo.codigocommand;

public class ApagarTVCommand implements Command{
    private TV tv;

    public ApagarTVCommand(TV tv){
        this.tv = tv;
    }
    public void execute(){
        tv.apagar();
    }
}
