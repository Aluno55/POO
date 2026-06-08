package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private String file;
    private double x;
    private double y;
    private boolean abaixada;

    public CartaGrafica(Naipe naipe, ValorCarta valor) {
        super(naipe, valor);
        file = "cartas/" + valor.getInicial() + naipe.getInitial() + ".png";
        abaixada = false;
    }
    
    public void desenhar(Draw desenho){

    }
}
