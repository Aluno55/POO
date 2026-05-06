package engtelecom.poo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;
// import java.awt.Color;
public class Relogio {
    private ArrayList<Display> dSeg;
    private ArrayList<Display> dMin;
    private ArrayList<Display> dHora;

    public Relogio() {
        dSeg = new ArrayList<>();
        dMin = new ArrayList<>();
        dHora = new ArrayList<>();
        Display d = new Display();
        for (int i = 0; i < 2; i++) {
            dSeg.add(d);
            dHora.add(d);
            dMin.add(d);
        }
    }
}