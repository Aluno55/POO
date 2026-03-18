package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public void setHorario(int hora, int minuto, int segundo) {
        if (hora >= 24){}
        else {this.hora = hora;}

        if (minuto >=60){}
        else{this.minuto = minuto;}

        if (segundo >=60){}
        else{this.segundo = segundo;}
    }

    public void setHorario(int hora, int minuto) {
        if (hora >= 24){}
        else {this.hora = hora;}

        if (minuto >=60){}
        else{this.minuto = minuto;}
    }

    public void setHorario(int hora) {
        if (hora >= 24){}
        else {this.hora = hora;}
    }

    public String toString(){ 
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
