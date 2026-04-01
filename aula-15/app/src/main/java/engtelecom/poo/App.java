package engtelecom.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // List
        var s = "Gustaff"; // var é o programa adivinhando qual tipo de variavel é
        ArrayList<String> l = new ArrayList<>();
        l.add("Phillip");
        l.add("d'Andrade");
        l.add("Baka");
        l.add(0, s);
        System.out.println(l);
        for (String string : l) {
            if (string.equals("Baka")) {
                System.out.println(string);
            }
        }
        
        // Set
        // Queue
        // Map
    }
}