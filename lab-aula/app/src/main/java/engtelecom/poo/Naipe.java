package engtelecom.poo;

public enum Naipe {
    PAUS(4, "\u2663"),
    OURO(1, "\u2666"),
    COPAS(3, "\u2665"),
    ESPADAS(2, "\u2660");

    public final int power;
    public final String nome;
    private Naipe(int power, String nome) {
        this.power = power;
        this.nome = nome;
    }

    public static Naipe getNaipeName(int c){
        for (Naipe i : Naipe.values()) {
            if (c == i.power) return i;
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    @Override
    public String toString(){return nome;}
}