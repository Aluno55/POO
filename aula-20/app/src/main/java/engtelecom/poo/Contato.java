package engtelecom.poo;
import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private Telefone phone;
    private Email mail;

    public Contato(String nome, String sobrenome, LocalDate nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
    }
    public String getNome() {return nome;}
    public String getSobrenome() {return sobrenome;}
    public Email getMail() {return mail;}
    public Telefone getPhone() {return phone;}
    public boolean addTelefone(String rot, String valor){return phone.add(valor, rot);}
    public boolean addEmail (String rot, String valor){return mail.add(valor, rot);}
    public boolean removeTelefone (String rotulo){return phone.remove(rotulo);}
    public boolean removeEmail (String rotulo){return mail.remove(rotulo);}
    public boolean updateTelefone (String valor, String rotulo){return phone.update(valor, rotulo);}
    public boolean updateEmail (String valor, String rotulo){return mail.update(valor, rotulo);}
}