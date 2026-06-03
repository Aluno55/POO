package engtelecom.poo;

public class Caixa <T> {//Tipos Genericos
    private T conteudo;
    
    public Caixa (T obj){
        set(obj);
    }

    public void set(T obj){
        this.conteudo = obj;
    }

    public T get(){
        return conteudo;
    }
}