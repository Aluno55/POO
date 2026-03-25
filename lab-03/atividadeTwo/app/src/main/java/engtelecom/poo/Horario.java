package engtelecom.poo;

public class Horario {
    private int hora=0;
    private int minuto=0;
    private int segundo=0;

    public Horario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public Horario(int hora, int minuto){this(hora, minuto, 0);}
    public Horario(int hora) {this(hora, 0,0);}
  
    public int getHora() {return hora;}
    public boolean setHora(int hora) {
        if (hora >= 24 || hora < 0){
            this.hora = 0;
            return false;
        }
        else {
            this.hora = hora;
            return true;
        }
    }
    public int getMinuto() {return minuto;}
    public boolean setMinuto(int minuto) {
        if (minuto >=60 || minuto < 0){
            this.minuto = 0;
            return false;
        }
        else{
            this.minuto = minuto;
            return true;
        }
    }
    public int getSegundo() {return segundo;}
    public boolean setSegundo(int segundo) {
        if (segundo >=60 || segundo < 0){
            this.segundo = 0;
            return false;
        }
        else{
            this.segundo = segundo;
            return true;
        }
    }

    public long toSeconds(){return this.hora * 3600 + this.minuto * 60 + segundo;}

    public long distance(Horario b) {return Math.abs(toSeconds() - b.toSeconds());}

    private String conversorExtenso(int valor){
        return switch (valor) {
            case 1 -> "um";
            case 2 -> "dois";
            case 10 -> "dez";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public String toExtenso(){
        String horas = ((this.hora == 1)? "uma" : (this.hora ==2)? "duas" : (hora < 20)? conversorExtenso(hora) : conversorExtenso((hora/10)*10) + " " + conversorExtenso(hora%10)) + " horas";

        String minutos = ((minuto < 20)? conversorExtenso(minuto) : conversorExtenso((minuto/10)*10) + " " + conversorExtenso(minuto%10)) + " minutos";

        String segundos = ((segundo < 20)? conversorExtenso(segundo) : conversorExtenso((segundo/10)*10) + " " + conversorExtenso(segundo%10)) + " segundos";
        
        if (minuto == 0){
            minutos = "";
            return horas;
        }        
        if (segundo == 0){
            segundos = "";
            return horas + " e " + minutos;
        }
        return horas + " e " + minutos + " e " + segundos;
    }

    public String toString(){ 
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}