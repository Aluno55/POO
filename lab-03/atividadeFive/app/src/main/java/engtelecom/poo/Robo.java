package engtelecom.poo;

public class Robo {
    private String nome = "";
    private int serie = 0;
    private static int contador = 0;

    public Robo(String nome) {
        this.nome = nome;
        ++contador;
        serie = contador;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getSerie() {return serie;}
    public int getCounter() {return contador;}
}
