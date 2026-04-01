package engtelecom.poo;

import java.util.ArrayList;

public class App {
    public static void menu(){
        int op = 0;
        int num = 0;
        var c = new ArrayList<Conta>();
        // criar conta; depositar; sacar; listar contas; sair;

        while (op != 5) {
            if (op == 1) {
                String n = IO.readln("Entre com um nome: ");
                double s = Double.parseDouble("Entre com o saldo: ");
                Conta conta = new Conta(num, n, s); 
                c.add(conta);
                num++;
            }

            if (op == 2) {
                double s = Double.parseDouble("Vai depositar quantos?: ");
                int qualConta = Integer.parseInt("Qual o numero da conta?: ");
                var newc = c.get(qualConta-1);
                newc.depositar(s);
            }
            
        }
    }
    public static void main(String[] args) {
        
        menu();

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