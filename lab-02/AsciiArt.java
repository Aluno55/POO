public class AsciiArt {
    public static void main(String[] args) {
    String shape = new String(args[1]);
    int tam = Integer.parseInt(args[2]), retangulo = Integer.parseInt(args[3]);    
    if (shape.equalsIgnoreCase("triangulo")){
        for (int i = 1; i <= tam; i++) {
            String repetida = "*".repeat(i); 
            System.out.println(repetida);
        }

    }
    else if (shape.equalsIgnoreCase("retangulo")){


    }
    else if (shape.equalsIgnoreCase("losango")){


    }


        

    }
}