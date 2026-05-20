package engtelecom.poo;

public class DigitalSeg extends Cronometro{

    private Display[] displays;

    public DigitalSeg(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        displays = new Display[6];
    }
}