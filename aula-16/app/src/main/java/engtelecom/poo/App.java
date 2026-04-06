package engtelecom.poo;

import java.util.HashMap;

public class App {
    HashMap<String, Livro> acervo = new HashMap<>();
    public void livraria () {}
    
    public static void main(String[] args) {
    App app = new App();
    app.livraria();
    Livro a = new Livro("The Sculpture", "S.C.P.", "948", 2010);
    Livro b = new Livro("The Hard-to-Kill Reptile", "S.C.P.", "244", 2010);
    Livro c = new Livro("The Doctor", "S.C.P.", "073", 2010);
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

    /*
    1- cadastrar livro
    2- listar isbn & titulo
    3- consultar livro por isbn, imprimir todos os dados
    4- consultar livro por autor, imprimir todos os dados
    5- atualizar dados do livro, menos isbn
    6- remover livro por isbn
    7- sair
    */
    }
}
