/*
Herança
subclasse (filho) vai ter tudo que a superclasse (pai)
classe filho pode adicionar ou modificar a classe pai
 */
package engtelecom.poo;
import engtelecom.poo.produtos.Dimensao;
import engtelecom.poo.produtos.SemFio;
import engtelecom.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        Dimensao d = new Dimensao(2,2,2);
        Telefone produtos[] = new Telefone[3];
        produtos[0] = new Telefone(10, null, null, 20, d);
        produtos[1] = new SemFio(10, null, null, 20, d, 37, 20, 100);
        for (Telefone i : produtos) {
            if (i instanceof SemFio c){
                double f = c.getFrequencia();
                System.out.println(f);
            }
        }
    }
}