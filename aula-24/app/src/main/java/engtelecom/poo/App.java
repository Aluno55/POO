package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Caixa<String> c = new Caixa<String>("Olá mundo");
        Caixa<Pessoa> p = new Caixa<Pessoa>(new Pessoa("Joao"));

        String s = c.get();

        // String erro = p.get();
    }
}