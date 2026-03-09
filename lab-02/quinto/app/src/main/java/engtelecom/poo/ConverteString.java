package engtelecom.poo;

import java.util.Scanner;
    public class ConverteString{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[9][9];
        int j=0;
        while(entrada.hasNext()){
            String linha = entrada.nextLine();
            for (int i = 0; i<9; i++) {
                matriz [j][i] = linha.charAt(i);
            }
            j++;
            System.out.println(linha.toUpperCase());
        }
    }
}