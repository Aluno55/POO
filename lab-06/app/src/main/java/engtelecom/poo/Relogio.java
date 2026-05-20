package engtelecom.poo;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;
    protected Draw clock;
    
    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void contar () throws InterruptedException {
        segundo++;
        if (segundo <= 60){
            minuto++;
            segundo = 0;
        }
        if (minuto <= 60){
            hora++;
            minuto = 0;
        }
        TimeUnit.SECONDS.sleep(1);
    };
}