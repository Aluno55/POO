package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int tripulanteMax;
    private int passageiroMax;
    private double pesoMax;
    private double combustivelMax;
    private int numMotores;
    private ArrayList<MotorAviao> motores = new ArrayList<>();
    
    public boolean possivelDecolar(double peso, double combustible, int tripulante, int passageiro){
        int variaveis = 0;
        variaveis = (peso < pesoMax)? +1 : 0;
        variaveis = (combustible < combustivelMax)? +1 : 0;
        variaveis = (tripulante < tripulanteMax)? +1 : 0;
        variaveis = (passageiro < passageiroMax)? +1 : 0;
        return (variaveis == 4);
    }

    public Aviao(double combustivelMax, int numMotores, String tipoMotor, int gastoPorHora, int tripulanteMax, int passageiroMax, double pesoMax) {
        this.numMotores = numMotores;
        this.tripulanteMax = tripulanteMax;
        this.passageiroMax = passageiroMax;
        this.pesoMax = pesoMax;
        this.combustivelMax = combustivelMax;
        for (int i = 0; i < numMotores; i++) {
          motores.add(new MotorAviao(tipoMotor, gastoPorHora));  
        }     
    }
    @Override
    public String toString() {
        return "Avião\n Maximo de Tripulantes: " + tripulanteMax + "\n Maximo de Passageiros: " + passageiroMax + "\n Peso Maximo: " + pesoMax
        + "\n Combustivel Maximo: " + combustivelMax + "\n Tem " + numMotores + " motores";
    }

    public void ligarMotor(int option){
        motores.get(option).ligarDesligar();;
    }

    public void ligarMotor(){
        for (int i = 0; i < numMotores; i++) {
            motores.get(i).ligarDesligar();
        }
    }

    public void acelerar(int v, int h){
        for (int i = 0; i < numMotores; i++) {
            motores.get(i).acelerar(v, h);
        }
    }
}