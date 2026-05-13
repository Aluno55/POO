package engtelecom.poo.minijogo;

public class Arqueiro extends Character{
    public Arqueiro(double x, double y) {
        super(25, 2, 1, x, y);
    }
    @Override
    public String atacar() {
        return "Arqueiro atirou no alvo, causando 2 de dano";
    }

    @Override
    public String mover(double x, double y) {
        double d = Math.sqrt(x * x + y * y);
        return "Arqueiro viajou por " + d + " metros";
    }
}