package engtelecom.poo;

public class Motor {
    private int HP;
    private int giroAtual;
    private int cilindros;

    public Motor(int hP, int giroAtual, int cilindros) {
        setHP(hP);
        this.giroAtual = giroAtual;
        this.cilindros = cilindros;
    }

    public void acelerar (int v){this.giroAtual += v;}
    public int getHP() {return HP;}
    public void setHP(int hP) {HP = hP;}
    public int getGiro() {return giroAtual;}
    public int getCilindros() {return cilindros;}
}
