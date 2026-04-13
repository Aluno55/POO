package engtelecom.poo;

public class App {
    public static void main(String[] args) {
// Diagrama +Getters e Setters omitidos
//- estáticos são sublinhados
//+Public -Private #???
// 
// Classe | -Atributos | +Métodos
//
// utilizar mermaid.ai/live ou draw.io
// 
        Motor m = new Motor(1, 0, 6);
        Carro c = new Carro("nsei de carro", m);
        c.acelerar(20);





        IO.println("Fim");
    }
}