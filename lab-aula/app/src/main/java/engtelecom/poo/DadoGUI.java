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
        return false;
    }
    
    @Override
    public void desenhar(Draw desenho){
        desenho.picture(x, y, file);
    }
}