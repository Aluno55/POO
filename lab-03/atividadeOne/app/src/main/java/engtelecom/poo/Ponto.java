package engtelecom.poo;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }

    public double distancia(Ponto a, Ponto b){
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }
}
