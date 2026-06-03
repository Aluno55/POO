package engtelecom.poo;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.text.MaskFormatter;

public class App {
    static String formatar (String mascara, String valor){
        try {
            MaskFormatter mask = new MaskFormatter(mascara);
        } catch (ParseException e) {
            System.out.println(e);
        } finally {}
        // try () {} catch (Exception e) {}
        return "";
    }

    public static void main(String[] args) {
        String s = formatar("(##)", "42");
        IO.println(s);

        /*Caixa<String> c = new Caixa<String>("Olá mundo");
        Caixa<Pessoa> p = new Caixa<Pessoa>(new Pessoa("Joao"));
        String s = c.get();
        String errado = p.get().getNome();*/
        
        /*Scanner ler = new Scanner(System.in);
        int a, b;
        try{
            System.out.println("Entre com o numero: ");
            a = ler.nextInt();
        System.out.println("Entre com o numero: ");
            b = ler.nextInt();
            int res = a/b;
            System.out.println(a + " dividido por " + b + " é " + res);
        }catch(InputMismatchException e){
            System.err.println("Só é permitido numeros inteiros");
            ler.nextLine();
        }catch(ArithmeticException e){
            System.err.println("Divisão indefinida");
            ler.nextLine();
        }catch(Exception e){
            System.err.println("Tu foi tão péssimo que conseguiu errar isso como?");
            ler.nextLine();
        // }
        */
        System.out.println("Fim do Programa");
    }
}