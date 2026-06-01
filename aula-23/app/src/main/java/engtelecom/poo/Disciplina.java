package engtelecom.poo;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;
    // private String[] d; // segunda, quarta
    
    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    public String toString() {
        return "Sigla: " + sigla + "\nDias: " + Arrays.toString(dias);
    }
}