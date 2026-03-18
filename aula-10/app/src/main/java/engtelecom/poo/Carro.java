package engtelecom.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual = 0;
    private double velocidadeMax;
    public static final double VELOCIDADE_MAXIMA = 300;
    private static final double VELOCIDADE_MINIMA = 0;

    public Carro(String modelo, double velocidadeMax) {
        this.modelo = modelo;
        if (velocidadeMax<=VELOCIDADE_MAXIMA) {this.velocidadeMax = velocidadeMax;} else {this.velocidadeMax = VELOCIDADE_MAXIMA;};
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        if (velocidadeMax<=VELOCIDADE_MAXIMA) {} else {this.velocidadeMax = VELOCIDADE_MAXIMA;};
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public double getVelocidadeAtual() {return velocidadeAtual;}
    public void setVelocidadeAtual(double velocidadeAtual) {this.velocidadeAtual = velocidadeAtual;}
    
    public double getVelocidadeMax() {return velocidadeMax;}
    public void setVelocidadeMax(double velocidadeMax) {this.velocidadeMax = velocidadeMax;}

    public void acelerar(double a) {
        if (velocidadeAtual<velocidadeMax){velocidadeAtual+=a;}
        if (velocidadeAtual>velocidadeMax){velocidadeAtual = velocidadeMax;}
    }
    public void frear(double a){
        if (velocidadeAtual>VELOCIDADE_MINIMA){velocidadeAtual-=a;}
        if (velocidadeAtual<VELOCIDADE_MINIMA){velocidadeAtual=VELOCIDADE_MINIMA;}
    }
}