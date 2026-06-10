package engtelecom.poo;
import java.util.Random;

public class Dado {
    private int faces;
    private int[] stats;

    public Dado(int faces) {
        this.faces = faces;
        stats = new int[faces];
    }

    public final int rodar(){
        Random r = new Random();
        int valor = r.nextInt(1, 7);
        this.stats[faces-1]++;
        return valor;
    }

    public String statistics(){
        return "Tem uma chance de " + 100/faces + "% de conseguir um valor em especifico";
    }
}