import java.util.Scanner;

public class LeitorArquivo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matriz = new String[9][9];
        int i = 0;
        while (scan.hasNext() && i < 9) {
            String linha = scan.nextLine();
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = linha.charAt(j);
            }
            //for feito por gpt
            i++;
        }
    }
}