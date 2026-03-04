public class estações {
    public static void main(String[] args) {
        String day = IO.readln("Entre com o dia: "), month = IO.readln("Entre com o mês: ");
    int dia = Integer.parseInt(day);
    int mes = 0;
    if (month.equalsIgnoreCase("janeiro")) {mes = 1;}
    else if (month.equalsIgnoreCase("fevereiro")) {mes = 2;}
    else if (month.equalsIgnoreCase("março")) {mes = 3;}
    else if (month.equalsIgnoreCase("abril")) {mes = 4;}
    else if (month.equalsIgnoreCase("maio")) {mes = 5;}
    else if (month.equalsIgnoreCase("junho")) {mes = 6;}
    else if (month.equalsIgnoreCase("julho")) {mes = 7;}
    else if (month.equalsIgnoreCase("agosto")) {mes = 8;}
    else if (month.equalsIgnoreCase("setembro")) {mes = 9;}
    else if (month.equalsIgnoreCase("outubro")) {mes = 10;}
    else if (month.equalsIgnoreCase("novembro")) {mes = 11;}
    else if (month.equalsIgnoreCase("dezembro")) {mes = 12;}
    else {
        IO.println("mes inválida");
        dia = 0;
    }
    
    if ((mes == 12 && dia >= 21) || (mes <= 3 && (mes < 3 || dia <= 20))) {
        IO.println("verão");}
    else if ((mes == 3 && dia >= 21) || (mes >= 4 && mes <= 5) || (mes == 6 && dia <= 20)) {
        IO.println("outono");}
    else if ((mes == 6 && dia >= 21) || (mes >= 7 && mes <= 8) || (mes == 9 && dia <= 22)) {
        IO.println("inverno");}
    else if ((mes == 9 && dia >= 23) || (mes >= 10 && mes <= 11) || (mes == 12 && dia <= 20)) {
        IO.println("primavera");}
    else {IO.println("data inválida");}   
    }
}