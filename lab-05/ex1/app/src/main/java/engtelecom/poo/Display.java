package engtelecom.poo;
import java.util.HashMap;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private HashMap<String, Segmento> segs;
    private int valor;

    public Display(){ 
        valor = 0;
        segs.put("A", new Segmento(false));
        segs.put("B", new Segmento(false));
        segs.put("C", new Segmento(false));
        segs.put("D", new Segmento(false));
        segs.put("E", new Segmento(false));
        segs.put("F", new Segmento(false));
        segs.put("G", new Segmento(false));
    }

    // posicionar os segmentos no canvas
}