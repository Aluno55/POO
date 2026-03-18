package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerar(500);
        System.out.println(c.getVelocidadeAtual());
        c.frear(510);
        System.out.println(c.getVelocidadeAtual());
        
        Pessoa p = new Pessoa();
        Pessoa b = new Pessoa();
        p.getNome();
    }
}