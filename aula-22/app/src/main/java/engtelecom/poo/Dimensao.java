package engtelecom.poo;

public class Dimensao {
    private double largura;
    private double altura;
    private double profundidade;

    @Override
    public String toString() {
        return "Dimensao []";
    }

    public Dimensao(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }
}