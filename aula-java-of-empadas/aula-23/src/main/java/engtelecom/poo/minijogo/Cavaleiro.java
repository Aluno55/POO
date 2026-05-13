package engtelecom.poo.minijogo;

public class Cavaleiro extends Character{
    public Cavaleiro(double x, double y) {
        super(50, 3, 2, x, y);
    }
    @Override
    public String atacar() {
        return "Cavaleiro cortou o alvo, causando "+ attack +" de dano";
    }

    @Override
    public String mover(double x, double y) {
        double d = Math.sqrt(x * x + y * y);
        return "Cavaleiro calopou por " + d + " metros";
    }
}
