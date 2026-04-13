package engtelecom.poo;

public class App {
    public static void main(String[] args) {
// Diagrama +Getters e Setters omitidos
//- estáticos são sublinhados
//+Public -Private #???
// 
// Classe | -Atributos | +Métodos
//
// utilizar mermaid.ai/live ou draw.io
// 
        Pessoa p = new Pessoa("The Author");
        Livro l = new Livro("The Tale", p);
        l.adicionarCapitulo("Void");
        l.adicionarCapitulo("The Kingdom of the Dark");
        l.adicionarCapitulo("The Majesty");
        l.adicionarCapitulo("It's Show Time");
        l.adicionarCapitulo("The Tale of Old");
        l.adicionarCapitulo("Field of Roses & Gold");
        IO.println("Fim");
    }
}