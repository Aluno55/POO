package engtelecom.poo;

public class Lampada {
    // Atributos
    private boolean ligada = false;

    // Métodos
    public void OffOn(){
        ligada = !ligada;
    }

    public boolean IsOnOff(){
        return ligada;
    }
    
}