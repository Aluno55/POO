package engtelecom.poo;

public class Disciplina {
    private int numeroProvas = 1;
    private double[] prova;

    public double getNotaProva (int qualProva){return prova[qualProva];}

    public void setNotaProva (double nota){
        double[prova.length] novo;
        if (numeroProvas < prova.length){
            prova(numeroProvas) = nota;
            numeroProvas++;
        }
    }

    public double Media (){
    double soma = 0;
        for (int i = 0; i < numeroProvas; i++)
            {soma += provas[i];}
        return ((soma + atividade) / (numeroProvas + 1));    
    }
}