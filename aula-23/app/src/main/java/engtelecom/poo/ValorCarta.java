package engtelecom.poo;

public enum ValorCarta {
    ACE("Ás", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6",6),
    SEVEN("7",7),
    ATE("8",8),
    NINE("9",9),
    TEN("10", 10),
    JACK("Valete",11),
    QUEEN("Rainha",12),
    KING("Rei",13);

    public final String nome;
    public final int valor;

    private ValorCarta(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }    

    public static ValorCarta getValue(int c){
        for (ValorCarta i : ValorCarta.values()) {
            if (c == i.valor) {
                return i;
            }
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    @Override
    public String toString(){return nome;}
}