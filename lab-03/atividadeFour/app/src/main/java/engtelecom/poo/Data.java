package engtelecom.poo;

public class Data {
    int dia = 01;
    int mes = 01;
    int ano = 1970;

    public void Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    public Data(int dia){Data(dia, 1, 1970);}
    public Data(int dia, int mes){Data(dia, mes, 1970);}
    
    public int getDia() {return dia;}
    public boolean setDia(int dia) {
        if(dia > 0 || dia < month2day()){
            this.dia = dia;
            return true;}
        return false;
    }
    public int getMes() {return mes;}
    public boolean setMes(int mes) {
        if(mes < 12 || mes > 0){
            this.mes = mes;
            return true;}
        return false;
    }
    public int getAno() {return ano;}
    public boolean setAno(int ano) {
        if (ano >= 0){
            this.ano = ano;
            return true;}
        return false;
    }

    private boolean bissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){return true;}
        return false;
    }
    private int month2day(){
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (bissexto()){return 29;}
                return 28;
            default:
                return 30;
        }
    }

    public String toString(){ 
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }
}