package engtelecom.poo;
import java.util.ArrayList;
import java.util.Collections;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {

    private Draw draw;
    
    @Override
    public void mouseClicked(double x, double y) {
    }

    public App(){
        this.draw = new Draw();
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(1,1200);
        this.draw.setYscale(1,600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE
        this.draw.setTitle("Jogo de Cartas");
        this.draw.addListener(this);
        this.draw.clear(Draw.GREEN);
        this.draw.show();
    }
    public static void main(String[] args) {
        ArrayList<Carta> deck = new ArrayList<>();
        for (Naipe n : Naipe.values()) {
            for (ValorCarta v : ValorCarta.values()) {
                Carta carta = new Carta(n, v);
                deck.add(carta);
            }            
        }
        Collections.shuffle(deck);
        App app = new App();
    }
}