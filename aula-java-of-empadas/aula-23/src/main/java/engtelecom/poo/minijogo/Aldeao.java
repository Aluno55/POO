package engtelecom.poo.minijogo;

public class Aldeao extends Personagem implements Guerreiro, Colecionador{
    public Aldeao(double x, double y) {
        super(25, 1, 0.8, x, y);
    }
    
    @Override
    public String atacar() {
        return "Aldeão bofetou o alvo, causando "+ attack +" de dano";
    }

    @Override
    public String mover(double x, double y) {
        double d = Math.sqrt(x * x + y * y);
        return "Aldeão caminhou por " + d + " metros";
    }
    @Override
    public String coletarMadeira(){
        return "Aldeão cortou madeira";
    }

    @Override
    public String coletarOuro(){
        return "Aldeão minerou ouro";
    }
}