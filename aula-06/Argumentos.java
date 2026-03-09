public class Argumentos {
public static void main(String[] args) {
    if (args.length != 2){
        System.out.println("erro");
    }
    else {
        System.out.println("Bom dia " + args[0]);
        System.out.println(args[1]);
    }
}
}