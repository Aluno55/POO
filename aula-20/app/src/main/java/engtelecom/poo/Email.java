package engtelecom.poo;
import java.util.HashMap;

public class Email {
    private HashMap<String, String> dados;

    public Email(String email, String rotulo) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(eR)){
            add(email, rotulo);
        }
    }

    public boolean add (String valor, String rotulo){
        dados.put(rotulo, valor);
        return false;
    }
    
    public boolean remove (String rotulo){
        if(dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
            }
        return false;
    }

    public boolean update (String valor, String rotulo){
        if (dados.containsKey(rotulo)) {
            dados.replace(rotulo, valor);
            return true;
        }
        return false;
    }
}