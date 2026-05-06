package engtelecom.poo;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class App {
    public static void main(String[] args) throws InterruptedException {
        int tam = 0;
        do {Integer.parseInt(IO.readln("Escolha um tamanho (1, 2 ou 3) para a imagem: "));
        if (tam < 3 && tam > 0){tam *=50;}} while (tam!=3||tam!=2||tam!=1);        
        Draw art = new Draw();
        art.setXscale(0, 1000);
        art.setYscale(0, 1000);
        art.setCanvasSize(1000,1000);
        art.setDefaultCloseOperation(3); // verificar depois
        art.enableDoubleBuffering(); // verificar depois
        art.clear(Draw.WHITE);
        art.setPenColor(Draw.LIGHT_GRAY);
        for (int i = 0; i <= 1000; i += 20) {
            art.line(i, 0, i, 1000);
            art.line(0, i, 1000, i);
        }
        for (int i = 0; i < 800; i++) {
            art.clear();
            art.text(500,500,""+i);
            art.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}