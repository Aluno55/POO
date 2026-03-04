package engtelecom.poo;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random r = new Random();
        int num = 0;
        for (int i = 0; i < 5 ; i++){
            num = r.nextInt(10);
            System.out.println(num);
        }
//        int num = r.nextInt();
//        System.out.println(num);




    }
}