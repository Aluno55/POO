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
        Telefone t = new Telefone(10, "nokia", "serie", 20, new Dimensao(2,2,2));
        System.out.println(t.toString());
        SemFio fio = new SemFio(10, "nokia", "serie", 20, new Dimensao(2,2,2), 30, 23, 151);
        System.out.println(fio.toString());
    }
}