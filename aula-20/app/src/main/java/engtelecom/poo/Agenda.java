package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> accounts;

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> novo = new ArrayList<>();
        accounts.forEach(e -> {
            if (e.getNome().equalsIgnoreCase(nome) && e.getSobrenome().equalsIgnoreCase(sobrenome)) {
                novo.add(e);
            }
        });
        return novo;
    }
    public boolean addContato (Contato c){
        accounts.add(c);
        return true;
    }
    public boolean removeContato (int indiceNaLista){
        accounts.get(indiceNaLista);
        return true;
    }
    public boolean addTelefone(String rotulo, String valor, int indice){
        accounts.get(indice).addTelefone(rotulo, valor);
        return true;
    }
    public boolean addEmail(String rotulo, String valor, int indice){
        accounts.get(indice).addEmail(rotulo, valor);
        return true;
    }
    public boolean updateTelefone(String rotulo, String valor, int indice){
        accounts.get(indice).updateTelefone(valor, rotulo);
        return true;
    }
    public boolean updateEmail(String rotulo, String valor, int indice){
        accounts.get(indice).updateEmail(valor, rotulo);
        return true;
    }
    public boolean removeTelefone(String rotulo, int indice){
        accounts.get(indice).removeTelefone(rotulo);
        return true;
    }
    public boolean removeEmail(String rotulo, int indice){
        accounts.get(indice).removeEmail(rotulo);
        return true;
    }
}