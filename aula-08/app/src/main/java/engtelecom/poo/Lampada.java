package engtelecom.poo;

public class Lampada {
    // Atributos
    private boolean ligada = false;

    // Métodos
    public void SwitchButton(){
        ligada = !ligada;
    }

    public boolean IsOnOff(){
        return ligada;
    }
    
}