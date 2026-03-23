package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Ponto a = new Ponto(0, 0);
        Ponto b = new Ponto(0, 0);
        a.setX(3);
        a.setY(4);
        System.out.println(a.distancia(b));
        System.out.println(b.distancia(a));
        System.out.println(a.toString());

    }
}
