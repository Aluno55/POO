package engtelecom.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Segmento {
    private boolean onoff;
    private Color cor;
    private double x;
    private double y;

    public Segmento(Color cor, double x, double y) {
        setOff();
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public boolean setOff(){return onoff = false;}
    public boolean setOn(){return onoff = true;}

    public Draw poligono(double d, String direction, Draw clock){
        Color escura = new Color((int)(cor.getRGB()*0.2));
        // clock.setCanvasSize(d, d);
        // clock.setXscale(0, d);
        // clock.setYscale(0, d);
        double fator = d*.25;
        clock.enableDoubleBuffering();
        clock.clear(Draw.LIGHT_GRAY);
        if (onoff) {
            clock.setPenColor(cor);
        } else {clock.setPenColor(escura);}
        if (direction.equalsIgnoreCase("Horizontal")) {
            x = d*.375;
            y = d*.225;
            double []xHorizontal= {0.1*fator+x, 0.2*fator+x, 1*fator+x, 1.1*fator+x, 1*fator+x, 0.2*fator+x};
            double []yHorizontal= {0.2*fator+y, 0.3*fator+y, 0.3*fator+y, 0.2*fator+y, 0.1*fator+y, 0.1*fator+y};
            clock.filledPolygon(xHorizontal, yHorizontal);
        } else {
            y = d*.25;
            double []xVertical= {0.1*fator+x, 0.2*fator+x, 0.2*fator+x, 0.1*fator+x, 1*fator+x, 0.2*fator+x};
            double []yVertical= {0.2*fator+y, 0.3*fator+y, 1*fator+y, 1.1*fator+y, 1*fator+y, 0.3*fator+y};
            clock.filledPolygon(xVertical, yVertical);
        }
        return clock;
    }
}