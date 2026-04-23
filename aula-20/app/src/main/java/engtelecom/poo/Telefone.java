package engtelecom.poo;
import java.text.ParseException;
import java.util.HashMap;

import javax.swing.text.MaskFormatter;

public class Telefone {
    private HashMap<String, String> dados;
    private MaskFormatter mask = null;

    @Override
    public String toString() {
        var resultado = "";
        try {
            mask = new MaskFormatter("(##) #####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(dados);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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