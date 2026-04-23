package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> accounts;

    public boolean addContato (Contato c){
        accounts.add(c);
        return true;
    }
    public boolean removeContato (int indiceNaLista){
        accounts.get(indiceNaLista);
        return true;
    }
}