package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
    private String title;
    private Pessoa autor;
    private ArrayList<Capitulo> caps;

    public Livro(String title, Pessoa autor) {
        this.title = title;
        this.autor = autor;
        caps = new ArrayList<>();
    }

    public void adicionarCapitulo(String t){
        Capitulo c = new Capitulo(t);
        caps.add(c);
    }
}