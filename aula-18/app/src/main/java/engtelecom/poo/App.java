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

        // // exemplo de agregação o--
        // // se carro for destruido, o motor ainda existe
        // Motor m = new Motor(1, 0, 6);
        // Carro c = new Carro("algo", m);

        // // exemplo de composição *--
        // // se livro for destruido, todos os capitulos serão juntos
        
        // Pessoa p = new Pessoa("The Author");
        // Livro l = new Livro("The Tale", p);
        // l.adicionarCapitulo("Void");
        // l.adicionarCapitulo("The Kingdom of the Dark");
        // l.adicionarCapitulo("The Majesty");
        // l.adicionarCapitulo("It's Show Time");
        // l.adicionarCapitulo("The Tale of Old");
        // l.adicionarCapitulo("Field of Roses & Gold");

      
        Aviao ave = new Aviao(2000, 6, "H", 30, 10, 500, 5000);
        IO.println(ave.toString());
        
        IO.println("Fim");
    }
}