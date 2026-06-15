package engtelecom.poo;

/**
* Calculadora que realiza operações aritiméticas simples
* @author Gustavo
*/
public class Calculadora {

    /**
    *   Soma de 2 valores inteiros e retorna o resultado
    *   @param a primeiro valor
    *   @param b segundo valor
    *   @return resultado da operação
    */
    public int soma (int a, int b){
        return a+b;
    }

    /**
     * 
     * @param a lado a
     * @param b lado b
     * @param c lado c
     * @return equilátero, isósceles, escaleno ou não é um triângulo
     */
    public String tipoTriangulo(int a, int b, int c){     
        if (a <= 0 || b <= 0 || c <= 0 || (a+b)<=c || (a+c)<=b || (c+b)<=a) return "não é um triângulo";
        if (a == b && a == c) return "equilátero";
        if (a == b || a == c || b == c) return "isósceles";
        return "escaleno";
    }
}