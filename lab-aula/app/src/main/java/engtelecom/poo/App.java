package engtelecom.poo;
import java.util.ArrayList;
// import java.util.Collections;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {

    private static Draw draw;
    private static ArrayList<Elements> elementos;

    @Override
    public void mouseClicked(double x, double y) {
        elementos.forEach(e->{
            if (e.clicouDentro(x,y)) {
                e.desenhar(draw);
            }
        });
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
        App app = new App();
        DadoGUI dado = new DadoGUI(6, 600, 300);
        elementos.add(dado);
        // deck = new ArrayList<>();
        // int x = 10;
        // for (Naipe n : Naipe.values()) {
        //     for (ValorCarta v : ValorCarta.values()) {
        //         CartaGrafica c = new CartaGrafica(n, v, x, 10);
        //         deck.add(c);
        //     }            
        // }
        // Collections.shuffle(deck);

        // for (CartaGrafica c : deck) {
        //     c.desenhar(draw);
        // }
        // draw.show();
    }
}