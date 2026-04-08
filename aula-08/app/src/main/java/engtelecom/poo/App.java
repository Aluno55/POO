package engtelecom.poo;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // List<Integer> lista = Arrays.asList(1, 2, 4, 5, 6);
        // int soma = 0;
        // soma = lista.stream()
        //     .filter(numero -> numero % 2 == 0) // Filtra os números pares
        //     .mapToInt(Integer::intValue) // Converte para IntStream
        //     .sum(); // Soma os números
        
        //     // Código imperativo equivalente
        // soma = 0;
        // for (Integer numero : lista) {
        //     if (numero % 2 == 0) {
        //        soma += numero;
        //     }
        // }

        List<String> lista = Arrays.asList("Java", "Stream", "API", "Collections");
        // Usando lambda
        int maior = lista.stream()
        .mapToInt(p-> p.length()) // Converte cada palavra para seu comprimento (int)
        .max() // Encontra o valor máximo entre os comprimentos
        .orElse(0); // Retorna 0 se a lista estiver vazia

        // Outra forma de escrever usando referência de método
        int maior2 = lista.stream()
        .mapToInt(String::length)
        .max()
        .orElse(0);
        
        int tam = 0;
        for (int i = lista.size(); i > 0; i--) {
            tam = (lista.get(i).length() > 0)? lista.get(i).length() : 0;
        }
    }
}