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

    public double acelerar(int v, int h){
        this.velocidade += v;
        return combustivel - combustivelPerHour - h;
    }

    public void ligarDesligar(){this.on=!on;}

    @Override
    public String toString() {
        return "Motor do Aviao de tipo " + type + ", gasta " + combustivelPerHour + " de combustivel por hora e atualmente está numa velocidade de" + velocidade;
    }
}