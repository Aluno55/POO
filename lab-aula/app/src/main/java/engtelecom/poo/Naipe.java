package engtelecom.poo;

public enum Naipe {
    OURO(1, "\u2666", 'o'),
    ESPADAS(2, "\u2660", 'e'),
    COPAS(3, "\u2665", 'c'),
    PAUS(4, "\u2663", 'p');

    public final int power;
    public final String nome;
    public final char initial;
    private Naipe(int power, String nome, char initial) {
        this.power = power;
        this.nome = nome;
        this.initial = initial;
    }

    public static Naipe getNaipeName(int c){
        for (Naipe i : Naipe.values()) {
            if (c == i.power) return i;
        }
        throw new IllegalArgumentException("Planeta Inválido");
    }

    public char getInitial() {
        return initial;
    }

    @Override
    public String toString(){return nome;}
}