package engtelecom.poo;
import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> segs = new ArrayList<>();

    public Display(){ 
        segs.add(new Segmento(false, "horizontal")); //A top
        segs.add(new Segmento(false, "vertical")); //B right up
        segs.add(new Segmento(false, "vertical")); //C right down
        segs.add(new Segmento(false, "horizontal")); //D bottom
        segs.add(new Segmento(false, "vertical")); //E left down
        segs.add(new Segmento(false, "vertical")); //F left up
        segs.add(new Segmento(false, "horizontal")); //G middle
    }
}
// // Desenhando outro segmento vertical, porém com x deslocado em 'fator' pixels
// for (int i = 0; i < xVertical.length; i++) {
// xVertical[i]+=fator;
// }
// desenho.filledPolygon(xVertical, yVertical);