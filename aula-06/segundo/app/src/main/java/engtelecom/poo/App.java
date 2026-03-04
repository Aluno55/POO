package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("erro");
        }
        else {
            System.out.println("Bom dia " + args[0]);
            System.out.println(args[1]);
        }

        //Exemplo com strings
//        String a = "POO", b = "ifsc";
//        int i = 10, j = 20;
//        if (!a.equalsIgnoreCase(b)){
//            System.out.println("não");
//        } else {
//            System.out.println("sim");
//        }
//        String d = "Eng" + "Telecom " + b + " " + a + i;
//
//        String jav = "java".repeat(100);
//        System.out.println(jav);
    }
}