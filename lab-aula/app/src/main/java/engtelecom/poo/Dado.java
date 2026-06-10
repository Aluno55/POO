package engtelecom.poo;

import java.util.Random;

public class Dado {
    private int valor; // curiosidade no d6: somando os 2 lados tem que resultar em 7 (um lado é 6 e o outro 1)
    private int faces;
    
    public Dado(int faces) {
        this.faces = faces;
    }

    public int rodar(){
        Random r = new Random();
        int a = r.nextInt(6);
        return valor;
    }

    public String statistics(){
        double s = 1/faces * 100;
        return "";
    }
}