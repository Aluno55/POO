package engtelecom.poo;
import engtelecom.poo.minijogo.Aldeao;
import engtelecom.poo.minijogo.Personagem;
import engtelecom.poo.minijogo.Arqueiro;
import engtelecom.poo.minijogo.Cavaleiro;
import engtelecom.poo.minijogo.Coletador;
import engtelecom.poo.minijogo.Guerreiro;

public class App {
    public static void main(String[] args) {
        Personagem personagem[] = new Personagem[3];
        personagem[0]= new Aldeao(0, 0);
        personagem[1]= new Arqueiro(0, 0);
        personagem[2]= new Cavaleiro(0, 0);

        Coletador c = new Aldeao(0, 0);
        c.coletarOuro();

        Aldeao a = new Aldeao(0, 0);
        Personagem p = a;
        p.mover(0, 0);
        a.mover(0, 0);
        a.coletarMadeira();
        //p.coletarMadeira(); não funciona pois Personagem não tem isso
        ((Aldeao) p).coletarMadeira(); // funciona pois p tem aldeão, caso contrario não funcionaria
        ((Aldeao)personagem[0]).coletarMadeira();
        for (int i = 0; i < personagem.length; i++) {
            System.out.println(personagem[i].mover(3, 4));
        }

        for (Personagem i : personagem) {
            if (i instanceof Guerreiro w){
                ((Guerreiro)i).atacar();
            }
            System.out.println(i.mover(3, 4));
            // System.out.println(i.atacar());
        }
    }
}