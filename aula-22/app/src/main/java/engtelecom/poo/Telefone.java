package engtelecom.poo;

public class Telefone {
    private int codigo;
    private String modelo;
    private String numSerie;
    private double peso;
    private Dimensao dimensao;
    
    public Telefone(int codigo, String modelo, String numSerie, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone [codigo=" + codigo + ", modelo=" + modelo + ", numSerie=" + numSerie + ", peso=" + peso
                + ", dimensao=" + dimensao + "]";
    }    
}