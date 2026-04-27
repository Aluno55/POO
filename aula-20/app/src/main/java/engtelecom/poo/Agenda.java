package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> accounts;
    public Agenda() {this.accounts = new ArrayList<>();}

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> novo = new ArrayList<>();
        accounts.forEach(e -> {
            if (e.getNome().equalsIgnoreCase(nome) && e.getSobrenome().equalsIgnoreCase(sobrenome)) {
                novo.add(e);
            }
        });
        return novo;
    }
    public ArrayList<Contato> getAccounts() {return accounts;}

    public boolean addContato (Contato c){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(c)) {
                return accounts.add(c);
            }
        }
        return false;
    }
    public boolean removeContato (int indiceNaLista){
        if (accounts.get(indiceNaLista) == null) {
            return false;
        }
        accounts.remove(indiceNaLista);        
        return true;
    }
    public boolean addTelefone(String rotulo, String valor, int indice){
        Telefone t = new Telefone();
        t.add(valor, rotulo);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(indice).getPhone() == t) {
                return addTelefone(rotulo, valor, indice);
            }
        }
        return false;
    }
    public boolean addEmail(String rotulo, String valor, int indice){
        Email t = new Email();
        t.add(valor, rotulo);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(indice).getMail() == t) {
                return addEmail(rotulo, valor, indice);
            }
        }
        return false;
    }
    public boolean updateTelefone(String rotulo, String valor, int indice){
        Telefone t = new Telefone();
        t.add(valor, rotulo);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(indice).getPhone() == t) {
                return updateTelefone(rotulo, valor, indice);

            }
        }
        return false;
    }
    public boolean updateEmail(String rotulo, String valor, int indice){
        Email t = new Email();
        t.add(valor, rotulo);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(indice).getMail() == t) {
                return updateEmail(rotulo, valor, indice);
            }
        }
        return false;
    }
    public boolean removeTelefone(String rotulo, int indice){return accounts.get(indice).removeTelefone(rotulo);}
    public boolean removeEmail(String rotulo, int indice){return accounts.get(indice).removeEmail(rotulo);}
}