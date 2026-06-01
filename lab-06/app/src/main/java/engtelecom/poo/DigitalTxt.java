package engtelecom.poo;
import java.awt.*;
import java.io.IOException;
import java.time.LocalTime;

public class DigitalTxt extends Cronometro {
    public DigitalTxt(int hora, int minuto, int segundo) {super(hora, minuto, segundo);}
 
    @Override
    public void cronometrar(boolean diminuir) throws InterruptedException, FontFormatException, IOException {
        var arquivo = App.class.getClassLoader().getResourceAsStream("Micro5-Regular.ttf");
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, arquivo);
        customFont = customFont.deriveFont(36f);
        clock.setFont(customFont);
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
            clock.text(.75,0.75,hora +":"+ minuto +":"+ segundo);
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