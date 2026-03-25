package engtelecom.poo;

public class Retangulo {
    private int largura = 4;
    private int altura = 3;
    private String codification = "ASCII";
   
    public Retangulo(int largura, int altura, String codification) {
        setAltura(altura);
        setCodification(codification);
        setLargura(largura);
    }

    public int getLargura() {return largura;}
    public boolean setLargura(int largura) {
        if (largura <= 0){return false;} else {
        this.largura = largura;
        return true;}
    }

    public int getAltura() {return altura;}
    public boolean setAltura(int altura) {
        if (altura <= 0){return false;} else {
        this.altura = altura;
        return true;}
    }

    public String getCodification() {return codification;}
    public boolean setCodification(String codification) {
        if (codification.equalsIgnoreCase("UTF8") || codification.equalsIgnoreCase("ASCII")){return false;} else {
        this.codification = codification;
        return true;}
    }

    public int area(){return altura * largura;}
    public int perimeter(){return 2*area();}

    @Override
    public String toString() {
        String topbottom = "";
        String height = "";
        if (codification.equalsIgnoreCase("ASCII")){
            topbottom = "+" + "-".repeat(largura-2) + "+\n";
            for (int i = altura-2; i > 0; i--) {
                height += "|" + " ".repeat(largura-2) + "|\n";
        }} else {
            topbottom = "\\u250c" + "\\u2500".repeat(largura-2) + "\\u2510\n";
            for (int i = altura-2; i > 0; i--) {
                height += "\\u2502" + " ".repeat(largura-2) + "\\u2502\n";
        }}
        return topbottom + height + topbottom;
    }
}
