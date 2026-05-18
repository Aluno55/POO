package engtelecom.poo.minijogo;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro(double x, double y) {
        super(25, 2, 1, x, y);
    }
    
    @Override
    public String atacar() {
        return "Arqueiro atirou no alvo, causando "+ attack +" de dano";
    }

    @Override
    public String mover(double x, double y) {
        double d = Math.sqrt(x * x + y * y);
        return "Arqueiro viajou por " + d + " metros";
    }
}