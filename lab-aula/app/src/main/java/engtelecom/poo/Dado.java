package engtelecom.poo;
import java.util.Random;

public class Dado {
    private int valor; // Curiosidade: a soma dos valores de faces contrarias num dado é igual ao numero de faces +1
    private int faces;
    
    public Dado(int faces, int valor) {
        this.faces = faces;
        this.valor = valor;
    }

    public int rodar(){
        Random r = new Random();
        int a = r.nextInt(valor);
        return a;
    }

    public String statistics(){
        double s = 1/faces * 100;
        return "Uma chance de " + s + " porcentos para cada valor";
    }
}