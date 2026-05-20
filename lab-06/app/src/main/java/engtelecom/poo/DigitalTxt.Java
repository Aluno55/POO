package engtelecom.poo;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class DigitalTxt extends Cronometro {
    public DigitalTxt(int hora, int minuto, int segundo) {super(hora, minuto, segundo);}
    @Override
    public void cronometrar(boolean diminuir) throws InterruptedException, FontFormatException, IOException {
        clock = new Draw();
        clock.enableDoubleBuffering();
        clock.setDefaultCloseOperation(3);
        var arquivo = App.class.getClassLoader().getResourceAsStream("Micro5-Regular.ttf");
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, arquivo);
        customFont = customFont.deriveFont(36f);
        clock.setFont(customFont);
        clock.text(.75,.75,"");
        clock.show();
    }

    @Override
    public void contar() throws InterruptedException, FontFormatException, IOException {
        clock = new Draw();
        clock.enableDoubleBuffering();
        clock.setDefaultCloseOperation(3);
        clock.setPenColor(cor);
        var arquivo = App.class.getClassLoader().getResourceAsStream("Micro5-Regular.ttf");
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, arquivo);
        customFont = customFont.deriveFont(36f);
        clock.setFont(customFont);
        DateTimeFormatter date = DateTimeFormatter.ofPattern("hh:mm:ss");

        while(true){
            clock.clear(Draw.LIGHT_GRAY);
            clock.text(.75,0.75,LocalTime.now().format(date));
            clock.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}