package engtelecom.poo;

public class Bissexto {
    public boolean anoBissexto(int ano){
        if (((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) && ano != 0) return true;
        return false;
    }
}