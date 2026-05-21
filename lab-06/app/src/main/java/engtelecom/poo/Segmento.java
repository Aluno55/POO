package engtelecom.poo;
import java.awt.Color;

public class Segmento {
    private boolean onoff;
    private Color cor;
    private double[] x;
    private double[] y;

    public boolean setOff(){

        return onoff = false;
    }

    public boolean setOn(){

        return onoff = true;
    }
}

// Draw desenho = new Draw();
// int dimensao = 800;
// desenho.setCanvasSize(dimensao, dimensao);
// desenho.setXscale(0, dimensao);
// desenho.setYscale(0, dimensao);
// double fator = 200;
// double fatorCor = 0.2;
// Color clara = Draw.GREEN;
// Color escura = new Color((int)(clara.getRed()*fatorCor),
// (int)(clara.getGreen()*fatorCor),
// (int)(clara.getBlue()*fatorCor));
// desenho.enableDoubleBuffering();
// desenho.clear(Draw.WHITE);
// // Desenhando grade quadriculada
// int grade = (int) fator/10;
// desenho.setPenColor(Draw.LIGHT_GRAY);
// for (int i = 0; i <= dimensao; i += grade) {
// desenho.line(i, 0, i, dimensao); // linha vertical
// desenho.line(0, i, dimensao, i); // linha horizontal
// }
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
// desenho.show();