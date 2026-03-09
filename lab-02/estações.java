public class estações {
    public static void main(String[] args) {
        String day = IO.readln("Entre com o dia: "), month = IO.readln("Entre com o mês: ");
    int dia = Integer.parseInt(day);
    int mes = 0;

        String estacao = switch (month.toLowerCase()) {
            case "janeiro", "fevereiro" -> "verão";
            case "março" -> {
                return (dia <21) ? "verao" : "outono";
            }
            case "abril", "maio" -> "outono";
            case "junho" -> {
                return (dia<21) ? "outono" : "inverno";
            }
            case "julho", "agosto" -> "inverno";
            case "setembro" -> {
                return (dia<21) ? "inverno" : "primavera";
            }
            case "outubro", "novembro" -> "primavera";
            case "dezembro" -> {
                return (dia<21) ? "primavera" : "verão";
            }
            default -> "data invalida";
        };

        System.out.println(estacao);
    }
}