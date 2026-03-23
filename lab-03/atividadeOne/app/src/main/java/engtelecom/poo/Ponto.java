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

    public double distancia(Ponto ponto2){
        return Math.sqrt(Math.pow((this.x - ponto2.x), 2) + Math.pow((this.y - ponto2.y), 2));
    }
}
