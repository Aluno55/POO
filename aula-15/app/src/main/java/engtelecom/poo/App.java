package engtelecom.poo;

import java.util.ArrayList;

public class App {
    private ArrayList <Conta> contas = new ArrayList<>();
    // public App(){this.contas = new ArrayList<>();}

    public void menu(){
        int options;
        int num = 0;
        // criar conta; listar contas; depositar; sacar; sair;
        do {
            options = Integer.parseInt(IO.readln("Escolha uma das opções:\n1-criar conta\n2-listar contas\n3-depositar\n4-sacar\n5-sair\n"));
            if (options == 1) {
                String n = IO.readln("Entre com um nome: ");
                double s = Double.parseDouble(IO.readln("Entre com o saldo: "));
                Conta conta = new Conta(num, n, s); 
                contas.add(conta);
                num++;
            }

            if (options == 2) {
                contas.forEach(e -> {
                System.out.println(e);
                });  // for each <e> in <contas>, do {this} 
            }

            if (options == 3) {
                double s = Double.parseDouble(IO.readln("Vai depositar quantos?: "));
                int qualConta = Integer.parseInt(IO.readln("Qual o numero da conta?: "));
                contas.forEach(e ->{
                    if (e.getConta() == qualConta) {
                        e.depositar(s);
                    }
                });
            }

            if (options == 4) {
                double s = Double.parseDouble(IO.readln("Vai sacar quantos?: "));
                int qualConta = Integer.parseInt(IO.readln("Qual o numero da conta?: "));
                contas.forEach(e ->{
                    if (e.getConta() == qualConta) {
                        e.sacar(s);
                    }
                });
            }

            if (options == 5) {
                System.out.println("Finalizando...");
            }
        }while (options != 5);
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