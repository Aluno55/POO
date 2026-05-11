package engtelecom.poo;

public class Telefone {
    private int codigo;
    private String modelo;
    private String numSerie;
    private double peso;
    private Dimensao dimensao;
    
    public Telefone(int c, String m, String n, double p, Dimensao d) {
        this.codigo = c;
        this.modelo = m;
        this.numSerie = n;
        this.peso = p;
        this.dimensao = d;
    }

    @Override
    public String toString() {
        return "Telefone [codigo=" + codigo + ", modelo=" + modelo + ", numSerie=" + numSerie + ", peso=" + peso
                + ", dimensao=" + dimensao + "]";
    }    
}