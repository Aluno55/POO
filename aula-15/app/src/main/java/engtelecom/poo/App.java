package engtelecom.poo;

import java.util.ArrayList;

public class App {
    private ArrayList <Conta> contas = new ArrayList<>();
    // public App(){this.contas = new ArrayList<>();}

    public void menu(){
        int op = Integer.parseInt("Escolha uma das opções:\n1-criar conta\n2-listar contas\n3-depositar\n");
        int num = 0;
        // criar conta; listar contas; depositar; sacar; sair;
        while (op != 5) {
            if (op == 1) {
                String n = IO.readln("Entre com um nome: ");
                double s = Double.parseDouble("Entre com o saldo: ");
                Conta conta = new Conta(num, n, s); 
                contas.add(conta);
                num++;
            }

            if (op == 2) {
                contas.forEach(e -> {
                System.out.println(e);
                });
            }

            if (op == 3) {
                double s = Double.parseDouble("Vai depositar quantos?: ");
                int qualConta = Integer.parseInt("Qual o numero da conta?: ");
                var newc = contas.get(qualConta-1);
                newc.depositar(s);

                contas.forEach(e ->{
                    if (num == e.getConta()) {
                        e.depositar(s);
                    }
                }
                );
            }

        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.menu();

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