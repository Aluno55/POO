package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws InterruptedException, FontFormatException, IOException {
        DigitalTxt t = new DigitalTxt(0, 0, 0);
        Analogico a = new Analogico(0, 0, 0);
        a.contar();
        t.contar();        
    }
}