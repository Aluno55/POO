package engtelecom.poo;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class Analogico extends Relogio{
    public Analogico(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void contar () throws InterruptedException {
        clock = new Draw();
        clock.enableDoubleBuffering();
        clock.setDefaultCloseOperation(3);
        double centroX = 0.5;
        double centroY = 0.5;
        double raio = 0.2;
        double sizeSeg = raio * 0.8;
        double sizeHora = raio /2;
        double raioStart = raio * 0.85;
        double raioEnd = raio * 0.95;
        double espessuraSeg = raio * 0.025;
        double espessuraHora = raio * 0.05;
        double angulo = 30;

        while (true) {
            clock.clear(Draw.LIGHT_GRAY);
            clock.setPenColor(Draw.WHITE);
            clock.filledCircle(centroX, centroY, raio);
            clock.setPenColor(Draw.BLACK);
            clock.setPenRadius(espessuraHora);
            for (int traco = 0; traco < 12; traco++) {
                double angle = Math.toRadians(traco*angulo);
                var sen = Math.sin(angle);
                var cos = Math.cos(angle);
                clock.line((centroX+raioEnd*sen), (centroY+raioEnd*cos), (centroX+raioStart*sen), (centroY+raioStart*cos));
            }
            LocalTime agora = LocalTime.now();
            hora = agora.getHour();
            minuto = agora.getMinute();
            segundo = agora.getSecond();
            double anguloHora = Math.toRadians(angulo * hora);
            double anguloMinuto = Math.toRadians(angulo * minuto);
            double anguloSegundo = Math.toRadians(angulo * segundo);
            clock.line((centroX), (centroY), (centroX + sizeHora * Math.sin(anguloHora)), centroY + sizeHora * Math.cos(anguloHora));
            clock.line((centroX), (centroY), (centroX + sizeSeg * Math.sin(anguloMinuto)), centroY + sizeSeg * Math.cos(anguloMinuto));
            clock.setPenColor(Draw.RED);
            clock.setPenRadius(espessuraSeg);
            clock.line((centroX), (centroY), (centroX + sizeSeg * Math.sin(anguloSegundo)), centroY + sizeSeg * Math.cos(anguloSegundo));
            clock.show();
            TimeUnit.SECONDS.sleep(1);
        }
    };
}