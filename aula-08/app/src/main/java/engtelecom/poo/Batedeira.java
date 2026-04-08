package engtelecom.poo;

public class Batedeira {
    // private String hook = "nenhum";
    private int speed = 0;
    private boolean onOff = false;

    public void setSpeed (int a){speed = a;}
    public void switchOnOff (){onOff=!onOff;}
    public int getSpeed (){return speed;}
    public boolean getOnOff (){return onOff;}
    
}