package engtelecom.poo;

import java.util.Scanner;
    public class ConverteString{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[9][9];
        while(entrada.hasNext()){
            String linha = entrada.nextLine();
            
            System.out.println(linha.toUpperCase());
        }
    }
}