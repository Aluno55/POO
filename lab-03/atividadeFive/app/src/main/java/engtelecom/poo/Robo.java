package engtelecom.poo;

public class Robo {
    String nome = "";
    int serie = 0;
    public Robo(String nome) {
        this.nome = nome;
        this.serie++;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    public int getSerie() {return serie;}
}
