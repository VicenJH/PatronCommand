package co.edu.uniquindio.edu.poo.codigocommand;

public class PrenderTVCommand implements Command{
    private TV tv;

    public PrenderTVCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.prender();
    }

}
