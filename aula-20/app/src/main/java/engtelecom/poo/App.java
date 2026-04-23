package engtelecom.poo;

public class App {
    public void menu(){
        int option = 1;
        Contato c;
        do {
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n0-sair\n"));
            if (option<0) {
                
            }
        } while (option != 0);
    }
    public static void main(String[] args) {
        //tem entidades, atributos e relacionamentos
        //associação, exemplo: alunos usam matriculas que usa cursos
    
    }
}