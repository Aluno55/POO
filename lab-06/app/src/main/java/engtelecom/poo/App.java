package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws InterruptedException, FontFormatException, IOException {
        // Relogio digital de 7 segmentos incompleto
        // DigitalSeg s = new DigitalSeg(0, 0, 0);
        // s.contar();

        // Relogio digital texto completo (?)
        // DigitalTxt t = new DigitalTxt(0, 0, 0);
        // t.contar();

        // Relogio analogico completo (?)
        Analogico a = new Analogico(0, 0, 0);
        a.contar();
    }
}