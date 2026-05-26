package engtelecom.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Display {
    private Segmento[] segs;
    private int num;

    public Display(int num, Color r, double d) {
        this.num = (num > 0)? num : 0;
        segs = new Segmento[7]; // 0 to 6
        segs[0] = new Segmento(r, d/2+d*.25, d/2);
        segs[0].poligono(d, "Horizontal");
        segs[1] = new Segmento(r, d/2+d*.25, d/2+d*.25);
        segs[1].poligono(d, "Vertical");
        segs[2] = new Segmento(r, d/2+d*.25, d/2+d*.25);
        segs[2].poligono(d, "Vertical");
        segs[3] = new Segmento(r, d/2, d/2);
        segs[3].poligono(d, "Horizontal");
        segs[4] = new Segmento(r, d/2, d/2);
        segs[4].poligono(d, "Vertical");
        segs[5] = new Segmento(r, d/2-d*.25, d/2);
        segs[5].poligono(d, "Vertical");
        segs[6] = new Segmento(r, d/2-d*.25, d/2);
        segs[6].poligono(d, "Horizontal");
        seteSegmentos();
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