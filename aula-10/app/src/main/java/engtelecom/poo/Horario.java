package engtelecom.poo;

public class Horario {
    private int hora=0;
    private int minuto=0;
    private int segundo=0;

    public void setHorario(int hora, int minuto, int segundo) {
        if (segundo >=60){
            // m = segundo%60; minuto += m;
        }
        else{this.segundo = segundo;}

        if (minuto >=60){
            // h = minuto%60; hora += h;
        }
        else{this.minuto = minuto;}
        
        if (hora >= 24){}
        else {this.hora = hora;}
    }

    public void setHorario(int hora, int minuto){
        setHorario(hora, minuto, segundo);}
    public void setHorario(int hora) {
        setHorario(hora, minuto, segundo);}

    public String toString(){ 
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
