package engtelecom.poo;

public class Termometro {
    private String unit;
    private double valor;
    private static final double CELSIUS_MIN = 0;
    private static final double KELVIN_MIN = 273.15;
    private static final double FAHRENHEIT_MIN = 32;
    private static final double CELSIUS_MAX = 100;
    private static final double KELVIN_MAX = 373.15;
    private static final double FAHRENHEIT_MAX = 212;

    public Termometro(double valor, String unit) {
        if (unit.equalsIgnoreCase("c")) {
            setUnit("Celsius");
            if (valor < CELSIUS_MIN) this.valor = CELSIUS_MIN;
            if (valor > CELSIUS_MAX) this.valor = CELSIUS_MAX;
        } else
        if (unit.equalsIgnoreCase("f")) {
            setUnit("Fahrenheit");
            if (valor < FAHRENHEIT_MIN) this.valor = FAHRENHEIT_MIN;
            if (valor > FAHRENHEIT_MAX) this.valor = FAHRENHEIT_MAX;
        } else
        if (unit.equalsIgnoreCase("k")) {
            setUnit("Kelvin");
            if (valor < KELVIN_MIN) this.valor = KELVIN_MIN;
            if (valor > KELVIN_MAX) this.valor = KELVIN_MAX;
        }
    }

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
    private void setUnit(String unit) {this.unit = unit;}

    public double set2Kelvin(double k){
        var c = k-KELVIN_MIN;
        if (unit.equalsIgnoreCase("celsius")){
            setUnit("Celsius");
            return c;
        }
        if (unit.equalsIgnoreCase("f")||unit.equalsIgnoreCase("fahrenheit")){
            setUnit("Fahrenheit");
            return 1.8*c+32;
        }
        return k;
    }

    public double set2Celsius(double c){
        if (unit.equalsIgnoreCase("k")||unit.equalsIgnoreCase("kelvin")){
            setUnit("Kelvin");
            return c+KELVIN_MIN;
        }
        if (unit.equalsIgnoreCase("f")||unit.equalsIgnoreCase("fahrenheit")){
            setUnit("Fahrenheit");
            return 1.8*c+32;
        }
        return c;
    }

    public double set2Fahrenheit(double f){
        var c = (f-32)/1.8;
        if (unit.equalsIgnoreCase("k")||unit.equalsIgnoreCase("kelvin")){
            setUnit("Kelvin");
            return c+KELVIN_MIN;
        }
        if (unit.equalsIgnoreCase("celsius")){
            setUnit("Celsius");
            return c;
        }
        return f;
    }

    public double differenceBetween(Termometro t){
        if (t.unit.equalsIgnoreCase(unit)) {
            
        }
        return 1;
    }

}