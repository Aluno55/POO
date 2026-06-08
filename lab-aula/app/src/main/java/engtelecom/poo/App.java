package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {

    private Draw draw;
    
    @Override
    public void mouseClicked(double x, double y) {
        this.draw.picture(x, y, "cartas/1o.png");
        this.draw.show();
    }

    public App(){
        this.draw = new Draw();
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(1,1200);
        this.draw.setYscale(1,600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3);
        this.draw.setTitle("Jogo de Cartas");

        this.draw.addListener(this);

        this.draw.clear(Draw.GREEN);
        this.draw.show();
    }
    public static void main(String[] args) {
        App app = new App();
    }
}