package engtelecom.poo;

public enum DiasDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda"),
    TERCA(3, "Terça"),
    QUARTA(4, "Quarta"),
    QUINTA(5, "Quinta"),
    SEXTA(6, "Sexta"),
    SABADO(7, "Sábado");

    public final int codigo;
    public final String extenso;

    private DiasDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiasDaSemana getCodigo(int c) {
        for (DiasDaSemana dia : DiasDaSemana.values()) {
            if (dia.codigo == c) {
                return dia;               
            }
        }
        throw new IllegalArgumentException("Código Inválido");
    }

    public String toString(){
        return extenso;
    }
}