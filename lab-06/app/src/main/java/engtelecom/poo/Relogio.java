package engtelecom.poo;
import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;
import edu.princeton.cs.algs4.Draw;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;
    protected Color cor;
    protected Draw clock;
    
    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void contar () throws InterruptedException, FontFormatException, IOException {
        segundo++;
        if (segundo >= 60){
            minuto++;
            segundo = 0;
        }
        if (minuto >= 60){
            hora++;
            minuto = 0;
        }
    };
    
    public void desenhar (){
        
    }
}