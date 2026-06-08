package engtelecom.poo;
import java.util.Random;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
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

    public boolean flipCard() {
        return abaixada = !abaixada;
    }
    
    public void desenhar(Draw desenho){
        if (abaixada){
            desenho.picture(x, y, fileAbaixada);
        } else {
            desenho.picture(x, y, file);
        }
        desenho.show();
    }
}