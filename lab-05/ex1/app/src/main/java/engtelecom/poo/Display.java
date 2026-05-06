package engtelecom.poo;
import java.util.ArrayList;

public class Display {
    ArrayList<Segmento> segs = new ArrayList<>();
    public Display() {
        Segmento a = new Segmento(false);
        for (int i = 0; i < 7; i++) {
            segs.add(a);
        }
    }

    public boolean seteSegmentos(int val){



        return true;
    }
}
// double fatorCor = 0.2;
// Color clara = Draw.GREEN;
// Color escura = new Color((int)(clara.getRed()*fatorCor),

// desenho.enableDoubleBuffering();
// desenho.clear(Draw.WHITE);

// double xInicial = 300;
// double yInicial = 400;
// // Montando vetores com os pontos em X e em Y para desenhar um segmento horizontal
// yInicial = 180;
// double[] xHorizontal = {0.1*fator+xInicial, 0.2*fator+xInicial, 1.0*fator+xInicial, 1.1*fator+xInicial, 1.0*fator+
// xInicial, 0.2*fator+xInicial};
// double[] yHorizontal = {0.2*fator+yInicial, 0.3*fator+yInicial, 0.3*fator+yInicial, 0.2*fator+yInicial, 0.1*fator+
// yInicial, 0.1*fator+yInicial};
// // Desenhando o segmento horizontal
// desenho.setPenColor(clara);
// desenho.filledPolygon(xHorizontal, yHorizontal);
// // Montando vetores com os pontos em X e em Y para desenhar um segmento vertical
// yInicial = 200;
// double[] xVertical = {0.1*fator+xInicial, 0.2*fator+xInicial, 0.2*fator+xInicial, 0.1*fator+xInicial, 0*fator+
// xInicial, 0*fator+xInicial};
// double[] yVertical = {0.2*fator+yInicial, 0.3*fator+yInicial, 1.0*fator+yInicial, 1.1*fator+yInicial, 1.0*fator+
// yInicial, 0.3*fator+yInicial};
// // Desenhando o segmento vertical
// desenho.setPenColor(escura);
// desenho.filledPolygon(xVertical, yVertical);
// // Desenhando outro segmento vertical, porém com x deslocado em 'fator' pixels
// for (int i = 0; i < xVertical.length; i++) {
// xVertical[i]+=fator;
// }
// desenho.filledPolygon(xVertical, yVertical);
// // Trocando o buffer para exibir o que foi desenhado
// desenho.show();}}