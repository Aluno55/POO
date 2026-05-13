package engtelecom.poo.minijogo;

public class Aldeao extends Character{
    public Aldeao(double x, double y) {
        super(25, 1, 0.8, x, y);
    }
    @Override
    public String atacar() {
        return "Aldeão bofetou o alvo, causando 1 de dano";
    }

    @Override
    public String mover(double x, double y) {
        double d = Math.sqrt(x * x + y * y);
        return "Aldeão caminhou por " + d + " metros";
    }
}