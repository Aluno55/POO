package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        
        // Lampada a = new Lampada(), b = new Lampada();
        // System.out.println(a.IsOnOff());
        // b.SwitchButton();
        // System.out.println(b.IsOnOff());

        Caneta bic = new Caneta();
        System.out.println(bic.inkDraw(0, 0, 300, 400));
        bic.capSwitch();
        System.out.println(bic.inkDraw(0, 0, 300, 400));
    }
}