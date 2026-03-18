package engtelecom.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual = 0;
    private double velocidadeMax;

    public Carro(String modelo, double velocidadeMax) {
        this.modelo = modelo;
        (velocidadeMax<=300)? this.velocidadeMax = velocidadeMax : this.velocidadeMax = 300;
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public double getVelocidadeAtual() {return velocidadeAtual;}
    public void setVelocidadeAtual(double velocidadeAtual) {this.velocidadeAtual = velocidadeAtual;}
    
    public double getVelocidadeMax() {return velocidadeMax;}
    public void setVelocidadeMax(double velocidadeMax) {this.velocidadeMax = velocidadeMax;}

    //velocidade maxima de 200 e minimo de 0
    public void acelerar(double a) {
        if (velocidadeAtual<velocidadeMax){velocidadeAtual+=a;}
        if (velocidadeAtual>velocidadeMax){velocidadeAtual = velocidadeMax;}
    }
    public void frear(double a){
        if (velocidadeAtual>0){velocidadeAtual-=a;}
        if (velocidadeAtual <0){velocidadeAtual = 0;}
    }
}