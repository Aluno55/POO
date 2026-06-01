package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        DiasDaSemana[] dias = {DiasDaSemana.SEGUNDA, DiasDaSemana.DOMINGO};
        Disciplina d = new Disciplina("POO", dias);
        IO.println(d);
    }
}