package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class Cronometro extends Relogio {
    public Cronometro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public void cronometrar (boolean diminuir) throws InterruptedException, FontFormatException, IOException{
        int a = 1;
        if (diminuir){a = -1;}
        segundo+=a;
        if (segundo <= 60){
            minuto+=a;
            segundo = 0;
        }
        if (minuto <= 60){
            hora+=a;
            minuto = 0;
        }
        TimeUnit.SECONDS.sleep(1);
    }
}