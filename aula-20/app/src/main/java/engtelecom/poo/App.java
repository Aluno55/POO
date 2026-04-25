package engtelecom.poo;
import java.time.LocalDate;

public class App {
    public void menu(){
        int option = 1;
        Agenda agenda = new Agenda();
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
                    int emailInt = Integer.parseInt(IO.readln("Qual o numero dele na lista?"));
                    int emailOption = Integer.parseInt(IO.readln("O que gostaria de fazer?:\n1-Adicionar Email\n2-Remover Email\n3-Atualizar Email"));
                    switch (emailOption) {
                        case 1:
                            // String k;
                            // String v;
                            // agenda.addEmail(k, v, emailInt);
                        break;
                        case 2:

                        break;
                        case 3:

                        break;
                    //     default:
                    //         IO.println("Opção invalida");
                    //     break;
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