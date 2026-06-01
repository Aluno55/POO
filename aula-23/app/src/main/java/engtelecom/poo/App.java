package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        // String sigla = IO.readln("Entre com a sigla: ");

        // int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia:"));
        // DiasDaSemana d1 = DiasDaSemana.getCodigo(dia1);

        // DiasDaSemana[] dias = {d1, DiasDaSemana.DOMINGO};
        // Disciplina d = new Disciplina(sigla, dias);
        // IO.println(d);

        int planeta = Integer.parseInt(IO.readln("Entre com a posição do planeta em relação ao Sol: "));
        Planetas p = Planetas.getPlanetasByPosition(planeta);
        System.out.println(p);

        String world = IO.readln("Entre com o nome de um planeta no Sistema Solar: ");
        Planetas w = Planetas.getPlanetasByName(world);
        System.out.println(w.posicao);
    }
}