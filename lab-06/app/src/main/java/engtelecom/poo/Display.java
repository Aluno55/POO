package engtelecom.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Display {
    private Segmento[] segs;
    private int num;

    public Display(int num) {
        this.num = num;
        segs = new Segmento[7]; // 0 to 6
        Color r = Draw.RED;
        segs[0] = new Segmento(r);
        segs[1] = new Segmento(r);
        segs[2] = new Segmento(r);
        segs[3] = new Segmento(r);
        segs[4] = new Segmento(r);
        segs[5] = new Segmento(r);
        segs[6] = new Segmento(r);
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