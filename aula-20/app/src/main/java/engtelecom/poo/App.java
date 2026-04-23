package engtelecom.poo;
import java.time.LocalDate;

public class App {
    public void menu(){
        int option = 1;
        Agenda agenda = new Agenda();
        do {
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n0-Sair\n1-Adicionar Contato\n"));
            if (option == 1){
                var name = IO.readln("Qual sobrenome?");
                var surname = IO.readln("Qual nome?");
                LocalDate date = LocalDate.parse(IO.readln("Qual nome?"));
                Contato conta = new Contato(surname, name, date);
                agenda.addContato(conta);
            }
            else {IO.println("Opção invalida");}
        } while (option != 0);
    }
    public static void main(String[] args) {
        //tem entidades, atributos e relacionamentos
        //associação, exemplo: alunos usam matriculas que usa cursos
    
    }
}