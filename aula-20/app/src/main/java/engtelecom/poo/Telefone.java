package engtelecom.poo;
import java.util.HashMap;

import javax.swing.text.MaskFormatter;

public class Telefone {
    private HashMap<String, String> dados;
    // MaskFormatter mask = new MaskFormatter("(##) #####-####");

    @Override
    public String toString() {
        return "";
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