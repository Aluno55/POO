package engtelecom.poo.minijogo;

public abstract class Personagem {
    // Attributes
    private String nome;
    protected int health;
    protected int attack;
    protected double speed;
    protected double positionX;
    protected double positionY;

    // Constructor
    public Personagem(int health, int attack, double speed, double x, double y) {
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.positionX = x;
        this.positionY = y;
    }

    // Methods
    public abstract String mover (double x, double y);
}