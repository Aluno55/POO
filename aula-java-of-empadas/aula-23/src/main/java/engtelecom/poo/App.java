package engtelecom.poo;
import engtelecom.poo.minijogo.Aldeao;
import engtelecom.poo.minijogo.Personagem;
import engtelecom.poo.minijogo.Arqueiro;
import engtelecom.poo.minijogo.Cavaleiro;

public class App {
    public static void main(String[] args) {
        Personagem personagem[] = new Personagem[3];
        personagem[0]= new Aldeao(0, 0);
        personagem[1]= new Arqueiro(0, 0);
        personagem[2]= new Cavaleiro(0, 0);

        for (Personagem i : personagem) {
            System.out.println(i.mover(3, 4));
            // System.out.println(i.atacar());
        }
    }
}