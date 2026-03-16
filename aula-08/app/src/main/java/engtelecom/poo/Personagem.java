package engtelecom.poo;

public class Personagem {
    private int health = 0;
    private int strength = 0;
    private int dexterity = 0;
    private int mana = 0;
    private int inteligence = 0;
    private int stamina = 0;
    private int endurance = 0;
    private int speed = 0;

    public void setStats(int str, int dex, int qi, int end, int spd){
        health = end * 4;
        mana = qi * 2;
        dexterity = dex;
        strength = str;
        endurance = end;
        inteligence = qi;
        stamina = (str+dex)/2;
        speed = spd;
    }

    public int getDexterity() {
        return dexterity;
    }
    public int getEndurance() {
        return endurance;
    }
    public int getHealth() {
        return health;
    }
    public int getInteligence() {
        return inteligence;
    }
    public int getMana() {
        return mana;
    }
    public int getStamina() {
        return stamina;
    }
    public int getStrength() {
        return strength;
    }
    public int getSpeed() {
        return speed;
    }
    public void defense(int dmg) {
        health -= (dmg-endurance);
    }
    public void costSpell(int cost){
        mana-=cost;
    }
    public void costSkill(int cost){
        stamina-=cost;
    }
}