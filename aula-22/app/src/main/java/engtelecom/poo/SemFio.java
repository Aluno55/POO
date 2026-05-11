package engtelecom.poo;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int c, String m, String n, double p, Dimensao d, double f, int canais, double distancia) {
        super(c, m, n, p, d);
        this.frequencia = f;
        this.canais = canais;
        this.distanciaOperacao = distancia;
    }
    
}