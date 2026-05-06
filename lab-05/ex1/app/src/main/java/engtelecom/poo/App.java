package engtelecom.poo;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

import edu.princeton.cs.algs4.Draw;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Draw art = new Draw();
        art.setXscale(0, 800);
        art.setYscale(0, 800);
        art.setCanvasSize(800,800);
        // art.setPenColor(Color.blue);
        // art.circle(400, 400, 100);
        // art.setPenColor(Color.red);
        // art.rectangle(100, 700, 70, 40);
        // art.filledCircle(50, 50, 50);
        // art.setPenColor(Color.lightGray);
        // double[] x = {100, 300, 500, 600};
        // double[] y = {100, 300, 300, 100};
        // art.text(400, 400, "compreensivel");
        // art.polygon(x, y);
        // art.clear();

        // for (int i = 0; i < 800; i+=50) {
        //     art.line(i,0,i,800);
        //     art.line(0,i,800,i);
        // }
        // art.show();
        for (int i = 0; i < 800; i++) {
            // art.clear();
            art.setFontSize(i);
            art.text(i,i, ""+i);
            TimeUnit.SECONDS.sleep(1);
        }

    // 1 relogio tem 6 displays, cada um com 7 segmentos
    }
}