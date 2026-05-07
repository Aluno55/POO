package engtelecom.poo;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.algs4.Draw;

public class App {
    public static void main(String[] args) throws InterruptedException {
        int tam = 0;
        do {Integer.parseInt(IO.readln("Escolha um tamanho (1, 2 ou 3) para a imagem: "));
        if (tam < 3 && tam > 0){tam *=50;}} while (tam<=0||tam>3);
        Relogio cont = new Relogio();
        cont.counter(tam);

        var val = tam;
        Draw art = new Draw();
        
    }
}