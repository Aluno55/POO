package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.freiar(20010);
        System.out.println(c.getVelocidadeAtual());
    }
}