package engtelecom.poo;

public class Disciplina {
    private int numeroProvas = 1;
    private double[] prova;

    public double[] getNotaProva (){return prova;}
    public void setNotaProva (double a){
        prova = a;
        numeroProvas++;
    }
    public double Media(){
        
    }
}