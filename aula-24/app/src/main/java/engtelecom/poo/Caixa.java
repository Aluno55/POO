package engtelecom.poo;

public class Caixa <T> {
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