// package engtelecom.poo;

public class Retangulo {
    private int largura = 4;
    private int altura = 3;
    private String codification = "ASCII";

    public int getLargura() {return largura;}
    public boolean setLargura(int largura) {
        if (largura < 0){return false;} else {
        this.largura = largura;
        return true;}
    }

    public int getAltura() {return altura;}
    public boolean setAltura(int altura) {
        if (altura < 0){return false;} else {
        this.altura = altura;
        return true;}
    }

    public String getCodification() {return codification;}
    public boolean setCodification(String codification) {
        if (codification == "UTF8" || codification == "ASCII"){return false;} else {
        this.codification = codification;
        return true;}
    }

    public int Area(){return altura * largura;}
}
