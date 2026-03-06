public class AsciiArt {
    public static void main(String[] args) {
    String shape = new String(args[0]);
    int tam = Integer.parseInt(args[1]), retangulo = Integer.parseInt(args[2]);
    if (tam > 0){  
    if (shape.equalsIgnoreCase("triangulo")){
        for (int i = 1; i <= tam; i++) {
            String repetida = "*".repeat(i); 
            System.out.println(repetida);
        }
    } else if (shape.equalsIgnoreCase("retangulo")){
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
        for (int i = 0; i < tam; i++) {
            
        }

    } else {System.out.println("Invalido");}
    } else {System.out.println("Invalido");}

        

    }
}