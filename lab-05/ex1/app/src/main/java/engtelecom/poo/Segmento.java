package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;

public class Segmento {
    private Draw seg = new Draw();
    private boolean onoff = false;

    public Segmento(boolean onoff) {this.onoff = onoff;}
    public boolean onSwitch (){return onoff = !onoff;}
}