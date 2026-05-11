package engtelecom.poo.produtos;

public class Telefone {
    private int codigo;
    protected String modelo;
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
        return "--Telefone--\n Codigo:" + codigo + "\nModelo:" + modelo + "\nNumero de Serie" + numSerie + "\nPeso:" + peso
                + "\nDimensoes:" + dimensao;
    }    
}