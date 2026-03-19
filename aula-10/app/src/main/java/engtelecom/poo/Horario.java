package engtelecom.poo;

public class Horario {
    private int hora=0;
    private int minuto=0;
    private int segundo=0;

    public void setHorario(int hora, int minuto, int segundo) {
        if (segundo >=60){
            minuto = segundo/60;
            this.segundo = segundo%60;
        }
        else{this.segundo = segundo;}

        if (minuto >=60){
            hora += minuto/60;
            this.minuto = minuto%60;
        }
        else{this.minuto = minuto;}
        
        if (hora >= 24){
            this.hora = hora%24;
        }
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
