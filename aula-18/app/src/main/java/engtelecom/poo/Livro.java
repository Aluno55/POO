package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
    private String title;
    private ArrayList<Capitulo> caps;

    public Livro(String title) {
        this.title = title;
        caps = new ArrayList<>();
    }

    public void adicionarCapitulo(String t){
        Capitulo c = new Capitulo(t);
        caps.add(c);
    }
}