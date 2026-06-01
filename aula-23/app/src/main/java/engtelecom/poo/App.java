package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        String sigla = IO.readln("Entre com a sigla: ");

        int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia:"));
        DiasDaSemana d1 = DiasDaSemana.getCodigo(dia1);

        DiasDaSemana[] dias = {d1, DiasDaSemana.DOMINGO};
        Disciplina d = new Disciplina(sigla, dias);
        IO.println(d);

    }
}