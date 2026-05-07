package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private Draw seg;
    private boolean onoff = false;

    public Segmento(boolean onoff, String direction) {
        this.onoff = onoff;
        if (direction.equalsIgnoreCase("vertical")){
            seg = new Draw();
            segmentoVertical();
        }
        else {
            seg = new Draw();
            segmentoHorizontal();
        }
    }
    public boolean onSwitch (){
        if (onoff){
        seg.setPenColor(Color.red);
        } else {
            Color escura = new Color(50,0,0);
            seg.setPenColor(escura);
        }
        return onoff = !onoff;
    }

    public void segmentoHorizontal(){
        double x0 = 300;
        double y0 = 400;
        double[] xHorizontal = {20*x0, 40*x0, 20*x0, 22*x0, 20*x0, 40*x0};
        double[] yHorizontal = {40*y0, 60*y0, 60*y0, 40*y0, 20*y0, 20*y0};
        Draw horizontal = new Draw();
        Color cor;
        if (onoff){
            cor = Color.RED;
        } else {
            cor = new Color(50,0,0);
        }        
        horizontal.setPenColor(cor);
        horizontal.filledPolygon(xHorizontal, yHorizontal);
    }
    
    public void segmentoVertical(){
        double x0 = 300;
        double y0 = 200;
        double[] xVertical = {20*x0, 40*x0, 40*x0, 20*x0, 20*x0, 40*x0};
        double[] yVertical = {40*y0, 60*y0, 20*y0, 22*y0, 20*y0, 60*y0};
        Draw vertical = new Draw();
        Color cor;
        if (onoff){
            cor = Color.RED;
        } else {
            cor = new Color(50,0,0);
        }  
        vertical.setPenColor(cor);
        vertical.filledPolygon(xVertical, yVertical);
    }
}