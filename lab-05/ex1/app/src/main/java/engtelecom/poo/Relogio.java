package engtelecom.poo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class Relogio {
    private int segundos;
    private int minutos;
    private int horas;
    private ArrayList<Display> displays; // 6 displays

    public Relogio() {
        segundos = 0;
        minutos = 0;
        horas = 0;
        displays = new ArrayList<>();
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
                    segundos++;
                    TimeUnit.SECONDS.sleep(1);
                }
                minutos++;
            }
            horas++;
            art.show();
        }
    }
}