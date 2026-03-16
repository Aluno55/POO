package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        
        // Lampada a = new Lampada(), b = new Lampada();
        // System.out.println(a.IsOnOff());
        // b.SwitchButton();
        // System.out.println(b.IsOnOff());

        Caneta bic = new Caneta();
        bic.definirCor("vermelho");
        System.out.println(bic.obterCor());
    }
}