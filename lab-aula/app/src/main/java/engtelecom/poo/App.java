package engtelecom.poo;
import java.util.ArrayList;
import java.util.Collections;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {

    private static Draw draw;
    private static ArrayList<CartaGrafica> deck;

    @Override
    public void mouseClicked(double x, double y) {
        for (CartaGrafica c : deck) {
            if (c.flipCard(x, y)) {
                c.desenhar(draw, x, y);
            }
            c.desenhar(draw, x, y);
        }
        draw.show();
    }

    public App(){
        draw = new Draw();
        draw.setCanvasSize(1200,600);
        draw.setXscale(1,1200);
        draw.setYscale(1,600);
        draw.enableDoubleBuffering();
        draw.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE
        draw.setTitle("Jogo de Cartas");
        draw.addListener(this);
        draw.clear(Draw.GREEN);
        draw.show();
    }
    public static void main(String[] args) {
        deck = new ArrayList<>();
        int x = 10;
        for (Naipe n : Naipe.values()) {
            for (ValorCarta v : ValorCarta.values()) {
                CartaGrafica c = new CartaGrafica(n, v, x, 10);
                deck.add(c);
            }            
        }
        Collections.shuffle(deck);

        App app = new App();
        for (CartaGrafica c : deck) {
            for (int i = 0; i < args.length; i+=20) {
                c.desenhar(draw, i, 100);
            }
            draw.show();
        }
    }
}