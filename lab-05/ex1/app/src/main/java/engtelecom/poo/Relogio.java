package engtelecom.poo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class Relogio {
    private ArrayList<Display>  dSeg;
    private ArrayList<Display> dMin;
    private ArrayList<Display> dHora;

    public Relogio() {
        dSeg = new ArrayList<>();
        dMin = new ArrayList<>();
        dHora = new ArrayList<>();
    }

    public void counter(int val) throws InterruptedException{
        Draw art = new Draw();
        art.setXscale(0, 1000);
        art.setYscale(0, 1000);
        art.setCanvasSize(1000,1000);
        art.setDefaultCloseOperation(3); // verificar depois
        art.enableDoubleBuffering(); // verificar depois
        art.clear(Draw.WHITE);
        art.setPenColor(Draw.LIGHT_GRAY);
        for (int i = 0; i <= 1000; i += 20) {
            art.line(i, 0, i, 1000);
            art.line(0, i, 1000, i);
        }
        for (int i = 0; i < 3600; i++) {
            art.clear();
            for (int j = 0; j < 60; j++) {
                for (int j2 = 0; j2 < 60; j2++) {
                    art.text(3*val,3*val,""+i);
                    TimeUnit.SECONDS.sleep(1);
                }
                art.text(3*val,3*val,""+i);
            }
            art.text(3*val,3*val,""+i);
            art.show();
        }
    }
}