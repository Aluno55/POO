public class atividade {
    
    public static void main(String[] args) {
        String day = IO.readln("Entre com o dia: "), month = IO.readln("Entre com o mês: ");
    int dia = Integer.parseInt(day);
    int mes = 0;
    if(month.equals("março")){mes = 3;}
    else if (month.equals("junho")){mes = 6;}
    else if (month.equals("setembro")){mes = 8;}
    else if (month.equals("dezembro")){mes =12;}
    
    switch (mes) {
        case 3: if (dia > 20){break;}
        case 1:
        case 2:
            System.out.println("Verão");
            break;
        case 4: case 5:
        default:
            break;
    }
    }
// Entre com o dia: 21
// Entre com o mês: março
// # Saída:
// Outono
}