package engtelecom.poo;
import edu.princeton.cs.algs4.Draw;

public class DadoGUI extends Dado implements Elements{
    private double x;
    private double y;
    private String file;

    public DadoGUI(int faces, double x, double y) {
        super(faces);
        file = "dados/" + rodar() + ".png";
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean clicouDentro (double x, double y){
        int w = 25;
        
        var w1 = this.y-w;
        var w2 = this.y+w;
        var h1 = this.x-w;
        var h2 = this.x+w;

        if (x > h1 && x < h2 && y > w1 && y < w2) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void desenhar(Draw desenho){
        desenho.picture(x, y, file);
    }
}