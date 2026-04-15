package engtelecom.poo;

public class Player {
    private String nome;

    public Player(String nome) {
        this.nome = nome;
    }
    
    public void jogar(Dado d){
        int result = d.roll();
    }

}