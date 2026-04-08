package engtelecom.poo;
import java.util.Stack;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Stack<String> stacks = new Stack<>();
        for (int i = 0; i < args.length; i++) {
            stacks.push(IO.readln());
        }
        var c = '(';
        stacks.search(c);
        
        
        

        // List<String> lista = Arrays.asList("Java", "Stream", "API", "Collections");
        // // Usando lambda
        // int maior = lista.stream()
        // .mapToInt(p-> p.length()) // Converte cada palavra para seu comprimento (int)
        // .max() // Encontra o valor máximo entre os comprimentos
        // .orElse(0); // Retorna 0 se a lista estiver vazia

        // // Outra forma de escrever usando referência de método
        // int maior2 = lista.stream()
        // .mapToInt(String::length)
        // .max()
        // .orElse(0);
        
        // int tam = 0;
        // for (int i = lista.size(); i > 0; i--) {
        //     tam = (lista.get(i).length() > 0)? lista.get(i).length() : 0;
        // }
    }
}