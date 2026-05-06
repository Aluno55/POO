package engtelecom.poo;
import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> segs = new ArrayList<>();

    public Display() {}

    public void segmentoHorizontal(int val){
        double x0 = 300;
        double y0 = 400;
        double[] xHorizontal = {20*x0, 40*x0, 20*x0, 22*x0, 20*x0, 40*x0};
        double[] yHorizontal = {40*y0, 60*y0, 60*y0, 40*y0, 20*y0, 20*y0};
        Draw horizontal = new Draw();
        Color cor;
        if (segs.get(val).getOnoff()){
            cor = Color.RED;
        } else {
            cor = new Color(50,0,0);
        }        
        horizontal.setPenColor(cor);
        horizontal.filledPolygon(xHorizontal, yHorizontal);
    }
    
    public void segmentoVertical(int val){
        double x0 = 300;
        double y0 = 200;
        double[] xVertical = {20*x0, 40*x0, 40*x0, 20*x0, 20*x0, 40*x0};
        double[] yVertical = {40*y0, 60*y0, 20*y0, 22*y0, 20*y0, 60*y0};
        Draw vertical = new Draw();
        Color cor;
        if (segs.get(val).getOnoff()){
            cor = Color.RED;
        } else {
            cor = new Color(50,0,0);
        }  
        vertical.setPenColor(cor);
        vertical.filledPolygon(xVertical, yVertical);
    }
}
// // Desenhando outro segmento vertical, porém com x deslocado em 'fator' pixels
// for (int i = 0; i < xVertical.length; i++) {
// xVertical[i]+=fator;
// }
// desenho.filledPolygon(xVertical, yVertical);