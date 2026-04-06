package engtelecom.poo;

import java.util.HashMap;

public class App {
    HashMap<String, Livro> acervo = new HashMap<>();
    public void livraria () {
        int option;
        do {
        /*
        1- cadastrar livro
        2- listar isbn & titulo
        3- consultar livro por isbn, imprimir todos os dados
    4- consultar livro por autor, imprimir todos os dados
    5- atualizar dados do livro, menos isbn
        6- remover livro por isbn
        7- sair
        */
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n1-Criar livro\n2-Listagem de Títulos com ISBN\n3-Consultar Livro pelo ISBN\n6-Remover livro\n7-Sair\n"));
            if (option == 1){
                String author = IO.readln("Entre com o Autor: ");
                String isbn = IO.readln("Entre com o ISBN: ");
                String titulo = IO.readln("Entre com o Titulo: ");
                int ano = Integer.parseInt(IO.readln("Entre com o ano de publicação:"));
                Livro a = new Livro(titulo, author, isbn, ano);
                acervo.put(a.getIsbn(), a);
            } 
            if (option == 2){
                acervo.forEach((k, v)->{
                    System.out.println("ISBN: " + v.getIsbn() + "\nTítulo: " + v.getTitulo());
                });
            }
            if (option == 3){
                String isbn = IO.readln("Entre com o ISBN: ");              
                if (acervo.containsKey(isbn)){
                    System.out.println(acervo.get(isbn));
                }
            }
            if (option == 4){

            }

            if (option == 5){

            }

            if (option == 6){
                String isbn = IO.readln("Entre com o ISBN: ");
                if (acervo.containsKey(isbn)){
                    acervo.remove(isbn);
                }
            }
            
            if (option == 7){System.out.println("Saindo...");}
        
        } while (option !=7);
    }
    
    public static void main(String[] args) {
    App app = new App();
    app.livraria();
    // Livro a = new Livro("The Sculpture", "S.C.P.", "948", 2010);
    // Livro b = new Livro("The Hard-to-Kill Reptile", "S.C.P.", "244", 2010);
    // Livro c = new Livro("The Doctor", "S.C.P.", "073", 2010);
    // // if (acervo.containsKey(a.getIsbn())){
    //     acervo.put(a.getIsbn(), a);
    // // }
    // acervo.put(b.getIsbn(), b);
    // acervo.put(c.getIsbn(), c);

    // acervo.forEach((k,v)->{
    //     IO.println(String.format("--Livro--\n%s", v));
    // });

    // for (Livro liv: acervo.values()){
    //     IO.println(liv);
    // }
    }
}
