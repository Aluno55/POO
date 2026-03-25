package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Robo a = new Robo("Bip");
        Robo b = new Robo("Bop");
        Robo c = new Robo("Robocop"); 
        System.out.println(a.getSerie());
        System.out.println(a.getCounter());
        System.out.println(b.getSerie());
    }
}
