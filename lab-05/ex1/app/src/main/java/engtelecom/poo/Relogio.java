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

    // val é para definir o tamanho do relogio, ver onde coloco depois
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
        int repeatSec = 0;
        int repeatMin = 0;
        int repeatHrs = 0;

        for (int i = 0; i < 3600; i++) {
            art.clear();
            for (int j = 0; j < 60; j++) {
                for (int j2 = 0; j2 < 60; j2++) {
                    if (segundos>=9){
                        segundos = 0;
                        repeatSec++;
                        displays.get(1).setSegmento(repeatSec);
                    }
                    displays.get(0).setSegmento(segundos);
                    segundos++;
                    TimeUnit.SECONDS.sleep(1);
                }
                if (repeatSec >= 6) {
                    repeatSec = 0;
                    displays.get(2).setSegmento(minutos);
                    minutos++;
                }
                if (minutos >= 9) {
                    repeatMin++;
                    minutos = 0;
                    displays.get(3).setSegmento(repeatMin);
                }
            }
            if (repeatMin >= 6){
                repeatMin = 0;
                horas++;
                displays.get(4).setSegmento(horas);
            }
            if (horas == 4 && repeatHrs == 2){
                horas = repeatHrs = 0;
                minutos = repeatMin = 0;
                segundos = repeatSec = 0;
            } else if (horas >= 9){
                repeatHrs++;
                horas = 0;
                displays.get(5).setSegmento(horas);
            }
            art.show();
        }
    }
}