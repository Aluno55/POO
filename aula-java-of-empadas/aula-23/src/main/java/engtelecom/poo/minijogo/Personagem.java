package engtelecom.poo.minijogo;

public class Personagem {
    protected int health;
    protected int attack;
    protected double speed;
    private double positionX;
    private double positionY;

    public Personagem(int health, int attack, double speed, double x, double y) {
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.positionX = x;
        this.positionY = y;
    }

    public String mover (double x, double y){
        double d = Math.sqrt(x * x + y * y);
        return "Alguem moveu um total de " + d;
        }
    public String atacar (){return "Alguem atacou";}
}