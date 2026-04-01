package engtelecom.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // List
        var s = "João"; // var é o programa adivinhando qual tipo de variavel é
        ArrayList<String> l = new ArrayList<>();
        l.add("Maria");
        l.add("Jorge");
        l.add("Pedro");
        l.add(0, s);
        System.out.println(l);
        // for (String string : l) {
        //     if (string.equals("Baka")) {
        //         System.out.println(string);
        //     }
        // }

        l.forEach(e -> {
            if (e.equals("Maria"))
            {System.out.println(e);}
        }); // LAMBDA! EU LEMBRO DE VC DESGRAÇA! (x, fx)
        l.remove("Maria");
        l.removeIf(e -> e.equals("Jorge"));
        System.out.println(l);

        // Set
        // Queue
        // Map
    }
}