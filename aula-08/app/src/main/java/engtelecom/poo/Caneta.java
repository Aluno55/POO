package engtelecom.poo;

public class Caneta{
    // Atributos

    private double inkPercent = 100;

    private String color = "preta";

    private boolean penCap = true;

    // Métodos

    public void colorSet(String c){ color=c; }

    public String colorGet(){ return color; }

    public double inkGet(){ return inkPercent; }

    public void capSwitch(){ penCap = !penCap; }

    public boolean capGet(){ return penCap; }

    public String inkDraw(double x1, double y1, double x2, double y2){
        double d = 0;
        double spent = 0;
        if (inkPercent <=0){
            return ("Não possui tinta nessa caneta");
        }
        if (penCap == false){
        d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        spent = 0.01*d;
        if (inkPercent <= spent){
            return("Percorrir " + d + "cm e gastei toda a tinta");
        }
        inkPercent -= spent;
        } else {return "Abre a caneta abestado";}
        return ("Percorrir " + d + "cm e gastei " + spent + "% de tinta");
    }
}