package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int tripulanteMax;
    private int passageiroMax;
    private double pesoMax;
    private double combustivelMax;
    private int numMotores;
    private MotorAviao propulsor;
    private String tipoMotor;
    private ArrayList<MotorAviao> motores = new ArrayList<>();
    
    public boolean possivelDecolar(double peso, double combustible, int tripulante, int passageiro){
        int variaveis = 0;
        variaveis = (peso < pesoMax)? +1 : 0;
        variaveis = (combustible < combustivelMax)? +1 : 0;
        variaveis = (tripulante < tripulanteMax)? +1 : 0;
        variaveis = (passageiro < passageiroMax)? +1 : 0;
        return (variaveis == 4);
    }

    public Aviao(double combustivelMax, int numMotores, MotorAviao propulsor, String tipoMotor) {
        this.numMotores = numMotores;
        this.propulsor = propulsor;
        this.tipoMotor = tipoMotor;
        
        motores.add(propulsor);
        
        this.combustivelMax = combustivelMax;
    }

    public void acelerar(int v){


    }
    
}