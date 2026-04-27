package engtelecom.poo;
import java.time.LocalDate;

public class App {
    Agenda agenda = new Agenda();
    public void menu(){
        int option = 1;
        do {
            option = Integer.parseInt(IO.readln("Escolha uma das opções:\n0-Sair\n1-Adicionar Contato\n2-Remover Contato\n3-Configurar Emails\n4-Configurar Telefones "));
            switch (option) {
                case 1:
                    var surname = IO.readln("Qual nome? ");
                    var name = IO.readln("Qual sobrenome? ");     
                    LocalDate date = LocalDate.parse(IO.readln("Qual a data de nascimento? "));
                    Contato conta = new Contato(surname, name, date);
                    agenda.addContato(conta);
                break;
                case 2:
                    String nome = IO.readln("Qual o nome?");
                    String sobrenome = IO.readln("Qual o sobrenome?");
                    int num = agenda.findContato(nome, sobrenome).indexOf(agenda);
                    if (agenda.removeContato(num)){System.out.println("Contato removido");};
                break;
                case 3:
                    int emailOption = Integer.parseInt(IO.readln("O que gostaria de fazer?:\n1-Adicionar Email\n2-Remover Email\n3-Atualizar Email"));
                    String nomeEmail = IO.readln("Qual o nome?");
                    String sobrenomeEmail = IO.readln("Qual o sobrenome?");
                    int emailInt = agenda.findContato(nomeEmail, sobrenomeEmail).indexOf(agenda);
                    String valor = IO.readln("Email?");
                    String rotulo = IO.readln("Rotulo?");
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
                    int phoneOption = Integer.parseInt(IO.readln("O que gostaria de fazer?:\n1-Adicionar Telefone\n2-Remover Telefone\n3-Atualizar Telefone"));
                    String nomeTelefone = IO.readln("Qual o nome?");
                    String sobrenomeTelefone = IO.readln("Qual o sobrenome?");
                    int phoneInt = agenda.findContato(nomeTelefone, sobrenomeTelefone).indexOf(agenda);
                    String valorTelefone = IO.readln("Email?");
                    String rotuloTelefone = IO.readln("Rotulo?");
                    switch (phoneOption) {
                        case 1:
                            agenda.addEmail(rotuloTelefone, valorTelefone, phoneInt);
                        break;
                        case 2:
                            agenda.removeEmail(rotuloTelefone, phoneInt);
                        break;
                        case 3:
                            agenda.updateEmail(rotuloTelefone, valorTelefone, phoneInt);
                        break;
                        default:
                            IO.println("Opção invalida");
                        break;
                    }
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
    }
}