package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private Draw seg = new Draw();
    private boolean onoff = false;

    public Segmento(Draw seg, boolean onoff) {
        this.onoff = onoff;
        this.seg = seg;
    }

    public boolean getOnoff(){return onoff;}

    public boolean onSwitch (){
        if (onoff){
        seg.setPenColor(Color.red);
        } else {
            Color escura = new Color(50,0,0);
            seg.setPenColor(escura);
        }
        return onoff = !onoff;
    }
}