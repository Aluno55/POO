package engtelecom.poo;
import java.awt.Color;

public class Display {
    private Segmento[] segs;
    private int num;
    private Color cor;

    public Display(int num, Color cor) {
        this.num = num;
        this.cor = cor;
        segs = new Segmento[7]; // 0 to 6
    }

    public void seteSegmentos(){
        segs[0].setOff();
        segs[1].setOff();
        segs[2].setOff();
        segs[3].setOff();
        segs[4].setOff();
        segs[5].setOff();
        segs[6].setOff();
        switch (num) {
            case 1:
                segs[1].setOn();
                segs[2].setOn();
                break;
            case 2:
                segs[0].setOn();
                segs[1].setOn();
                segs[3].setOn();
                segs[4].setOn();
                segs[6].setOn();
                break;
            case 8:
                segs[0].setOn();
                segs[1].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[4].setOn();
                segs[5].setOn();
                segs[6].setOn();
                break;
            case 3:
                segs[0].setOn();
                segs[1].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[6].setOn();
                break;
            case 4:
                segs[1].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[5].setOn();
                segs[6].setOn();
                break;
            case 5:
                segs[0].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[5].setOn();
                segs[6].setOn();
                break;
            case 6:
                segs[0].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[4].setOn();
                segs[5].setOn();
                segs[6].setOn();
                break;
            case 9:
                segs[0].setOn();
                segs[1].setOn();
                segs[2].setOn();
                segs[3].setOn();
                segs[5].setOn();
                segs[6].setOn();
                break;
            case 7:
                segs[0].setOn();
                segs[1].setOn();
                segs[2].setOn();
                break;
            default:
                break;
        }
    }

}