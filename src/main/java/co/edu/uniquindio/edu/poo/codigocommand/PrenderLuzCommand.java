package co.edu.uniquindio.edu.poo.codigocommand;

public class PrenderLuzCommand implements Command{
    private Luz luz;
    public PrenderLuzCommand(Luz luz){
        this.luz = luz;
    }
    public void execute(){
        luz.prender();
    }

}
