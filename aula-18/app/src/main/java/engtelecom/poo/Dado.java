package engtelecom.poo;

import java.util.Random;

public class Dado {
    private int sides = 6; // default = 6

    public Dado(int sides) {
        this.sides = sides;
    }
    
    public int roll(){
        Random r = new Random();
        return r.nextInt(1, sides);
    }
}