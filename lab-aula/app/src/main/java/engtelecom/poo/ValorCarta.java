package engtelecom.poo;

public enum ValorCarta {
    ACE("Ás", 1, "1"),
    TWO("2", 2, "2"),
    THREE("3", 3, "3"),
    FOUR("4", 4, "4"),
    FIVE("5", 5, "5"),
    SIX("6",6, "6"),
    SEVEN("7",7, "7"),
    ATE("8",8, "8"),
    NINE("9",9, "9"),
    TEN("10", 10, "10"),
    JACK("Valete",11, "J"),
    QUEEN("Rainha",12, "Q"),
    KING("Rei",13, "K");

    public final String nome;
    public final int valor;
    public final String inicial;

    private ValorCarta(String nome, int valor, String inicial) {
        this.nome = nome;
        this.valor = valor;
        this.inicial = inicial;
    }    

    public static ValorCarta getValue(int c){
        for (ValorCarta i : ValorCarta.values()) {
            if (c == i.valor) return i;
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    public String getInicial() {
        return inicial;
    }

    @Override
    public String toString(){return nome;}
}