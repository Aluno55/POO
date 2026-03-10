package engtelecom.poo;

import java.util.Scanner;
    public class Questão5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[9][9];
        int j=0;
        while(entrada.hasNext() && j < 9){
            String linha = entrada.nextLine();
            for (int i = 0; i<9; i++) {
                matriz [j][i] = linha.charAt(i) == '.' ? 0 : 9;
                if (matriz[i][j] == 9){
                    for (int offset1 = -1; offset1 < 1; offset1++) {
                        for (int offset2 = -1; offset2 < 1; offset2++) {
                            int vizinho1 = offset1 + i, vizinho2 = offset2 + j;
                            if (vizinho1 >= 0 && vizinho1 < 9 && vizinho2 < 9 && vizinho2 >= 0) {
                                if (matriz[offset1][offset2] != 9) {
                                    ++matriz[offset1][offset2];
                                }
                            }
                    }
                    }
                }
            }

            /*  "offset"
                i-1     i   i+2
            j-1 |     |     |    
            j   |     |     | 
            j+1 |     |     |    
            */

            j++;
            // System.out.println(linha.toUpperCase());
        }
        entrada.close();
    }
}