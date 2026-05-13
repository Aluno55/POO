package engtelecom.poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int c, String m, String n, double p, Dimensao d, double f, int canais, double distancia) {
        super(c, m, n, p, d);
        this.frequencia = f;
        this.canais = canais;
        this.distanciaOperacao = distancia;
        this.modelo = "a";
    }

    @Override
    public String toString() {
        return "--Telefone sem Fio--\n" + super.toString()+ "\nFrequencia:" + frequencia + "\nCanais:" + canais + "\nDistancia Operacional:" + distanciaOperacao;
    }

    public double getFrequencia() {return frequencia;}    
}