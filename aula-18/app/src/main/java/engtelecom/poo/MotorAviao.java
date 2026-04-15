package engtelecom.poo;

public class MotorAviao {
    private String type;
    private double combustivelPerHour;
    private boolean on = false;
    private double velocidade;
    private double combustivel;

    public MotorAviao(String type, double combustivelPerHour) {
        this.type = type;
        this.combustivelPerHour = combustivelPerHour;
    }

    public void acelerar(int v){
        this.velocidade += v;
        combustivel -= combustivelPerHour;
    }

    public void ligarDesligar(){this.on=!on;}
}