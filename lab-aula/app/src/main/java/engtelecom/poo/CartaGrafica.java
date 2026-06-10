package engtelecom.poo;
import java.util.Random;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements Elements{
    private String file;
    private String fileAbaixada;
    private double x;
    private double y;
    private boolean abaixada;

    public CartaGrafica(Naipe naipe, ValorCarta valor, double x, double y) {
        super(naipe, valor);
        file = "cartas/" + valor.getInicial() + naipe.getInitial() + ".png";
        Random r = new Random();
        int i = r.nextInt(2);
        char c = (i<2)? 'v' : 'b';
        fileAbaixada = "cartas/fundo"+c;
        abaixada = false;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean clicouDentro(double x, double y) {
        int w = 72;
        int h = 96;
        
        var w1 = this.y-w/2;
        var w2 = this.y+w/2;
        var h1 = this.x-h/2;
        var h2 = this.x+h/2;

        if (x > h1 && x < h2 && y > w1 && y < w2) {
            file = fileAbaixada;
            return abaixada = !abaixada;
        } else {
            return abaixada;
        }
    }

    @Override
    public void desenhar(Draw desenho){
        desenho.picture(x, y, file);
    }
}