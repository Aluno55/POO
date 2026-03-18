package engtelecom.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual = 0;

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerePorA(double a) {
        if (velocidadeAtual<200){
        velocidadeAtual+=a;}
        else if (velocidadeAtual > 200){
            velocidadeAtual = 200;
        }
    }
    public void freiePorA(double a){
        if (velocidadeAtual>0){
        velocidadeAtual-=a;}
        else if (velocidadeAtual <0){
            velocidadeAtual = 0;
        }
    }
}
