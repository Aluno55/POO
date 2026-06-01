package engtelecom.poo;

public enum Planetas {
    MERCURY(1, "Mercury"),
    VENUS(2, "Venus"),
    EARTH(3, "Earth"),
    MARS(4, "Mars"),
    JUPITER(5, "Jupiter"),
    SATURN(6, "Saturn"),
    URANUS(7, "Uranus"),
    NEPTUNE(8, "Neptune");

    public final int posicao;
    public final String nome;

    private Planetas(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static Planetas getPlanetasByPosition(int c) {
        for (Planetas p : Planetas.values()) {
            if (p.posicao == c) {
                return p;
            }
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    public static Planetas getPlanetasByName(String c){
        for (Planetas p : Planetas.values()) {
            if (p.nome.equalsIgnoreCase(c)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    @Override
    public String toString(){return nome;}
}
