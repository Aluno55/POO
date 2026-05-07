package engtelecom.poo;
import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> segs;
    private int valor;

    public Display(){ 
        valor = 0;
        segs.add(new Segmento(false, "horizontal")); //A top
        segs.add(new Segmento(false, "vertical")); //B right up
        segs.add(new Segmento(false, "vertical")); //C right down
        segs.add(new Segmento(false, "horizontal")); //D bottom
        segs.add(new Segmento(false, "vertical")); //E left down
        segs.add(new Segmento(false, "vertical")); //F left up
        segs.add(new Segmento(false, "horizontal")); //G middle
    }
    // posicionar os segmentos no canvas
}