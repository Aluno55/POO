package engtelecom.poo.produtos;

public class Dimensao {
    private double largura;
    private double altura;
    private double profundidade;

    public Dimensao(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return " Largura= " + largura + " | Altura= " + altura + " | Profundidade= " + profundidade;
    }    
}