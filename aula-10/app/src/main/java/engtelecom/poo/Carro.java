package engtelecom.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual = 0;

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    //velocidade maxima de 200 e minimo de 0
    public void acelerar(double a) {
        if (velocidadeAtual<200){velocidadeAtual+=a;}
        if (velocidadeAtual>200){velocidadeAtual = 200;}
    }
    public void frear(double a){
        if (velocidadeAtual>0){velocidadeAtual-=a;}
        if (velocidadeAtual <0){velocidadeAtual = 0;}
    }
}