package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class App {
    private Draw draw;
    public App(){
        this.draw = new Draw();
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(1,1200);
        this.draw.setYscale(1,600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3);
        this.draw.setTitle("Jogo de Cartas");
    }
    public static void main(String[] args) {
        App app = new App();
        

    }
}
