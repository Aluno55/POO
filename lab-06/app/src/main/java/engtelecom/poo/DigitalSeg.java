package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;
import java.time.LocalTime;
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
        while(true){
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
            displays[5] = new Display(segundo%10, cor, 1, clock);
            displays[4] = new Display(segundo/10, cor, 1, clock);
            displays[3] = new Display(minuto%10, cor, 1, clock);
            displays[2] = new Display(minuto/10, cor, 1, clock);
            displays[1] = new Display(hora%10, cor, 1, clock);
            displays[0] = new Display(hora/10, cor, 1, clock);
        }
    }

    @Override
    public void contar() throws InterruptedException, FontFormatException, IOException {
        hora = LocalTime.now().getHour();
        minuto = LocalTime.now().getMinute();
        segundo = LocalTime.now().getSecond();
        cronometrar(false);
    }
}