import java.util.Random;

public class MatrizAsteriscos {
    public static void main(String[] args) {
        Random r = new Random();
        String[][] s = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                s[i][j]=".";
            }
        }
        for (int i = 0; i < 10; i++) {
            int n1 = r.nextInt(9), n2 = r.nextInt(9);
            s[n1][n2]="*";
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
