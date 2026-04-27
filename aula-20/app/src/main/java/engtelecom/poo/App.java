package engtelecom.poo;
import java.time.LocalDate;

public class App {
    Agenda agenda = new Agenda();
    public void menu(){
        int option = 1;
        do {
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n0-Sair\n1-Adicionar Contato\n2-Remover Contato\n3-Configurar Emails\n4-Configurar Telefones"));
            switch (option) {
                case 1:
                    var name = IO.readln("Qual sobrenome?");
                    var surname = IO.readln("Qual nome?");
                    LocalDate date = LocalDate.parse(IO.readln("Qual nome?"));
                    Contato conta = new Contato(surname, name, date);
                    agenda.addContato(conta);
                break;
                case 2:
                    int num = Integer.parseInt(IO.readln("Qual a posição do contato?"));
                    agenda.removeContato(num);
                break;
                case 3:
                    int emailOption = Integer.parseInt(IO.readln("O que gostaria de fazer?:\n1-Adicionar Email\n2-Remover Email\n3-Atualizar Email"));
                    String nome = IO.readln("Qual o nome?");
                    String sobrenome = IO.readln("Qual o sobrenome?");
                    agenda.findContato(nome, sobrenome);
                    switch (emailOption) {
                        case 1:
                            agenda.addEmail(rotulo, valor, emailInt);
                        break;
                        case 2:
                            agenda.removeEmail(rotulo, emailInt);
                        break;
                        case 3:
                            agenda.updateEmail(rotulo, valor, emailInt);
                        break;
                        default:
                            IO.println("Opção invalida");
                        break;
                    }
                    break;
                case 4:
                    // int phone = Integer.parseInt(IO.readln("1-Adicionar Telefone\n2-Remover Telefone\n3-Atualizar Telefone"));
                    break;
                default:
                    IO.println("Opção invalida");
                break;
            }
        } while (option != 0);
    }
    public static void main(String[] args) {
        App menu = new App();
        menu.menu();
        //tem entidades, atributos e relacionamentos
        //associação, exemplo: alunos usam matriculas que usa cursos
    }
}