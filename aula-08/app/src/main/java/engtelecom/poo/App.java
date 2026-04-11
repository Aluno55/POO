package engtelecom.poo;
import java.util.Stack;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Stack<Character> stacks = new Stack<>();
        String chaves = IO.readln("Insira uma frase ou formula: ");

        for (int i = 0; i < chaves.length(); i++) {
            char c = chaves.charAt(i);
            if (c == '(' || c == '{' || c == '['){stacks.push(c);}
            else if (c == ')' || c == ']' || c == '}'){
                if (stacks.empty()) {IO.println("Fechou sem abrir: " + c); continue;}
                char t = stacks.pop();
                if ((t == '(' && c == ')') || (t == '[' && c == ']') || (t == '{' && c == '}')){
                    IO.println("Um par achado: " + t + c);              
                } else {IO.println("Erro de par: " + t + c);}
            }
        }
        if (!stacks.empty()){IO.println("Par não achado");}
        
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