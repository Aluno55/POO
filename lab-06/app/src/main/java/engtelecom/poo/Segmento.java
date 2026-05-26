package engtelecom.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Segmento {
    private boolean onoff;
    private Color cor;
    private double x;
    private double y;

    public Segmento(Color cor) {
        setOff();
    }

    public boolean setOff(){return onoff = false;}
    public boolean setOn(){return onoff = true;}

    public void poligono(int d, String direction){
        Draw desenho = new Draw();
        Color escura = new Color((int)(cor.getRGB()*0.2));
        desenho.setCanvasSize(d, d);
        desenho.setXscale(0, d);
        desenho.setYscale(0, d);
        double fator = d*.25;
        desenho.enableDoubleBuffering();
        desenho.clear(Draw.LIGHT_GRAY);
        if (onoff) {
            desenho.setPenColor(cor);
        } else {desenho.setPenColor(escura);}
        if (direction.equalsIgnoreCase("Horizontal")) {
            x = d*.375;
            y = d*.225;
            double []xHorizontal= {0.1*fator+x, 0.2*fator+x, 1*fator+x, 1.1*fator+x, 1*fator+x, 0.2*fator+x};
            double []yHorizontal= {0.2*fator+y, 0.3*fator+y, 0.3*fator+y, 0.2*fator+y, 0.1*fator+y, 0.1*fator+y};
            desenho.filledPolygon(xHorizontal, yHorizontal);
        } else {
            y = d*.25;
            double []xVertical= {0.1*fator+x, 0.2*fator+x, 0.2*fator+x, 0.1*fator+x, 1*fator+x, 0.2*fator+x};
            double []yVertical= {0.2*fator+y, 0.3*fator+y, 1*fator+y, 1.1*fator+y, 1*fator+y, 0.3*fator+y};
            desenho.filledPolygon(xVertical, yVertical);
        }
    }
}
// for (int i = 0; i < xVertical.length; i++) {
// xVertical[i]+=fator;