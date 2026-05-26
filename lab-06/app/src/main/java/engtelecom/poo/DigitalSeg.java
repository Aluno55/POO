package engtelecom.poo;
import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import edu.princeton.cs.algs4.Draw;

public class DigitalSeg extends Cronometro{

    private Display[] displays;

    public DigitalSeg(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        cor = Draw.RED;
        displays = new Display[6]; // 0 to 5
    }

    @Override
    public void cronometrar(boolean diminuir) throws InterruptedException, FontFormatException, IOException {
        super.cronometrar(diminuir);
    }

    @Override
    public void contar() throws InterruptedException, FontFormatException, IOException {
        clock = new Draw();
        clock.enableDoubleBuffering();
        clock.setDefaultCloseOperation(3);
        while (true) {
            segundo++;
            if (segundo >= 60){
                minuto++;
                segundo = 0;
            }
            if (minuto >= 60){
                hora++;
                minuto = 0;
            }
            displays[5] = new Display(segundo%10, cor, 1);
            displays[4] = new Display(segundo/10, cor, 1);
            displays[3] = new Display(minuto%10, cor, 1);
            displays[2] = new Display(minuto/10, cor, 1);
            displays[1] = new Display(hora%10, cor, 1);
            displays[0] = new Display(hora/10, cor, 1);
            clock.clear();
            clock.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}