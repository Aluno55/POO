package engtelecom.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class App {
    public static void main(String[] args) {
        Draw art = new Draw();
        art.setXscale(0, 800);
        art.setYscale(0, 800);
        art.setCanvasSize(800,800);
        art.setPenColor(Color.blue);
        art.circle(400, 400, 100);
        art.setPenColor(Color.red);
        art.rectangle(100, 700, 70, 40);
        art.filledCircle(50, 50, 50);
    }
}