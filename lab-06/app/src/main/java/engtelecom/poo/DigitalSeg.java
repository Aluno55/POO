package engtelecom.poo;
import java.awt.FontFormatException;
import java.io.IOException;

public class DigitalSeg extends Cronometro{

    private Display[] displays;

    public DigitalSeg(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        displays = new Display[6];
    }
    @Override
    public void cronometrar(boolean diminuir) throws InterruptedException, FontFormatException, IOException {
        super.cronometrar(diminuir);
    }

    @Override
    public void contar() throws InterruptedException, FontFormatException, IOException {
        
        super.contar();
    }

    
}