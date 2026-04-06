package engtelecom.poo;

public class Conta {
    private int conta;
    private String nome;
    private double saldo;

    public Conta(int conta, String nome, double saldo) {
        setSaldo(saldo);
        this.nome = nome;
        this.conta = conta;
    }

    public int getConta() {return conta;}
    public String getNome() {return nome;}
    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public double sacar(double v) {return (v > saldo)? saldo : saldo - v;}
    public void depositar(double d){setSaldo(this.saldo + d);}

    public String toString(){
        return String.format("Conta: %d\nTitulo: %s\nSaldo: %.2f\n", conta, nome, saldo);
        // return ("""
        //        Conta: %d
        //        Titular: %s
        //        Saldo: %.2f
        //         """, conta, nome, saldo);
    }
    
}