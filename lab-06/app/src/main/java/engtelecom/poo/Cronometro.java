package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;

public abstract class Cronometro extends Relogio {
    public Cronometro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public void cronometrar (boolean diminuir) throws InterruptedException, FontFormatException, IOException{
        int a = 1;
        if (diminuir){
            segundo--;
            if (segundo <= 0 && minuto !=0){
                minuto--;
                segundo = 59;
            } else if (segundo <=0){segundo = 0;}
            if (minuto <= 0 && hora !=0){
                hora--;
                minuto = 59;
            } else if(minuto<=0){minuto = 0;}
            if (hora <= 0){
                hora = 0;
            }
        } else {
            segundo++;
            if (segundo >= 60){
                minuto++;
                segundo = 0;
            }
            if (minuto >= 60){
                hora++;
                minuto = 0;
            }
        }
    }

    @Override
    public void contar () throws InterruptedException, FontFormatException, IOException {
        cronometrar(false);
    };
}