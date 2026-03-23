package engtelecom.poo;

public class Horario {
    private int hora=0;
    private int minuto=0;
    private int segundo=0;

    public void setHorario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
  
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora >= 24 || hora < 0){
            this.hora = 0;
        }
        else {this.hora = hora;}
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if (minuto >=60 || minuto < 0){
            this.minuto = 0;
        }
        else{this.minuto = minuto;}
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if (segundo >=60 || segundo < 0){
            this.segundo = 0;
        }
        else{this.segundo = segundo;}
    }
    public long toSeconds(){
        return this.hora * 3600 + this.minuto * 60 + segundo;
    }

    public long distance(Horario b) {
        return Math.abs(toSeconds() - b.toSeconds());
    }

    public void setHorario(int hora, int minuto){
        setHorario(hora, minuto, segundo);}
    public void setHorario(int hora) {
        setHorario(hora, minuto, segundo);}

    public String toString(){ 
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}