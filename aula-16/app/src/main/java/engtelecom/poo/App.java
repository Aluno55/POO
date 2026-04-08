package engtelecom.poo;
import java.util.HashMap;

public class App {
    HashMap<String, Livro> acervo = new HashMap<>();
    public void livraria () {
        int option;
        do {
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n1-Criar livro\n2-Listagem de Títulos com ISBN\n3-Procurar Livro pelo ISBN\n4-Procurar Livro pelo Autor\n5-Atualizar Livro\n6-Remover livro\n7-Sair\n"));
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
                    IO.println("ISBN: " + v.getIsbn() + "\nTítulo: " + v.getTitulo());
                });
            }
            
            if (option == 3){
                String isbn = IO.readln("Entre com o ISBN: ");              
                if (acervo.containsKey(isbn)){
                    IO.println(acervo.get(isbn));
                }
                else{IO.println("Nenhum livro encontrado");}
            }

            if (option == 4){
                String author = IO.readln("Entre com o Autor: ");
                acervo.forEach((k, v)->{
                    if (v.getAutor().equalsIgnoreCase(author)){
                        IO.println(v);
                    }
                });
                // {IO.println("Nenhum livro encontrado");}
            }

            if (option == 5){
                String isbn = IO.readln("Entre com o ISBN: ");
                if (acervo.containsKey(isbn)){
                    Livro bookNew = acervo.get(isbn);
                    bookNew.setAnoPublication(Integer.parseInt(IO.readln("Entre com o novo ano de publicação:")));
                    bookNew.setAutor(IO.readln("Entre com o novo Autor: "));
                    bookNew.setTitulo(IO.readln("Entre com o novo Titulo: "));
                } else {IO.println("Nenhum livro encontrado");}
            }

            if (option == 6){
                String isbn = IO.readln("Entre com o ISBN: ");
                if (acervo.containsKey(isbn)){
                    acervo.remove(isbn);
                } else {IO.println("Nenhum livro encontrado");}
            }
            
            if (option == 7){IO.println("Saindo...");}
            if (option>7 || option<1){IO.println("Escolha uma opção valida");}
        } while (option !=7);
    }
    
    public static void main(String[] args) {
    App app = new App();
    app.livraria();
        // hashmap.forEach((v1, v2) - > {function;})
        // collection.forEach(variable -> {function})
        // collection.forEach(classe::SingleFunction)
        // for (classe var : collection) {function;}
        // for (Map.Entry<classe, classe> valor : collection()){function;}
        // hashmap is like a collection of collections, meanwhile a collection is like a FIFO, FILO, List, etc...
    }
}