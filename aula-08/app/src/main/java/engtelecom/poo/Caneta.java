package engtelecom.poo;

public class Caneta{
    // Atributos
    private double inkPercent = 100;
    private String color = "preta";

    // Métodos
    public void colorSet(String c){ color=c; }
    public String colorGet(){ return color; }
    public double inkGet(){ return inkPercent; }
    public void inkSet(double d){ inkPercent=d; }
}