package engtelecom.poo;
import java.util.Random;

public class App {
            public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(99) + 1;
        int acerto = 0, contagem = 0, chute = 0;

        while (acerto == 0){
            String s = IO.readln("adivinhe o numero inteiro: ");
            chute = Integer.parseInt(s);    
            if (chute > i) {System.out.println("o chute foi alto, tente novamente!");}
            if (chute < i) {System.out.println("o chute foi baixo, tente novamente");}
            if (chute == i) {System.out.println("Acertou!");
                acerto = 1;
            }   
            contagem++;
        }
    }
}
