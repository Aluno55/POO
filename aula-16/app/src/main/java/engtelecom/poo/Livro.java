package engtelecom.poo;

public class Livro {
    private String titulo;
    private String autor;
    private final String isbn;
    private int anoPublication;

    public Livro(String titulo, String autor, String isbn, int anoPublication) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublication(anoPublication);
        this.isbn = isbn;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public String getIsbn() {return isbn;}
    public int getAnoPublication() {return anoPublication;}
    public void setAnoPublication(int anoPublication) {this.anoPublication = anoPublication;}

    public String toString(){
        return String.format("""
                ISBN: %s
                Título: %s
                Autor: %s
                Ano de Publicação: %d
                """, isbn, titulo, autor, anoPublication
        );
    }


}