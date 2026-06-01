package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException, FontFormatException, IOException {
        Relogio[] r = new Relogio[3];
        r[0] = new DigitalTxt(0, 0, 0);
        r[1] = new Analogico(0, 0, 0);
        while (true) {
            for (Relogio v : r){
                v.contar();
                
            }
            TimeUnit.SECONDS.sleep(1);
        }

        // Relogio digital de 7 segmentos incompleto
        // DigitalSeg s = new DigitalSeg(0, 0, 0);
        // s.contar();

        // Relogio digital texto completo (?)
        // DigitalTxt t = new DigitalTxt(0, 5, 0);
        // t.contar();
        // t.cronometrar(true);

        // Relogio analogico completo (?)
        // Analogico a = new Analogico(0, 0, 0);
        // a.contar();
    }
}