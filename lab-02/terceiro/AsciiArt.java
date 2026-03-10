public class AsciiArt {

    public static void main(String[] args) {
    String shape = args[0];
    int tam = Integer.parseInt(args[1]);
    if (tam > 0){  

    if (shape.equalsIgnoreCase("triangulo")){
        for (int i = 1; i <= tam; i++) {
            String repetida = "*".repeat(i); 
            System.out.println(repetida);
        }

    } else if (shape.equalsIgnoreCase("retangulo")){
        int retangulo = Integer.parseInt(args[2]);
        for (int i = 1; i <= tam; i++) {
            if (i == 1 || i == tam){
                String repetida = "*".repeat(retangulo); 
                System.out.println(repetida);
            } else {
                for (int j = 1; j <= retangulo; j++) {
                    if (j == 1 || j ==retangulo){System.out.print("*");}
                    else {System.out.print(" ");}
                }
                System.out.println();
            } 
        }

    } else if (shape.equalsIgnoreCase("losango") && (tam % 2 != 0)){
        int meio = tam/2;
        for (int i = 0; i < tam; i++) {
            int space = Math.abs(meio - i);
            int pontos = tam - 2 * space;
            String simbolos = "*".repeat(pontos), espacos = " ".repeat(space);
            System.out.println(espacos + simbolos);
        } //boa parte do losango foi feito com ajuda do gpt, desculpe-me

    } else {System.out.println("Invalido");}
    } else {System.out.println("Invalido");}

        

    }
}