
void main(){

    int i = 10;
    String resultado;

    switch (i) {
        case 1:
            resultado = "um";
            break;
        case 2:
            resultado = "dois";
            break;
        case 3:
            resultado = "tres";
            break;
        default:
            resultado = "outro valor";
    }
    IO.println(resultado);

    String s = switch(i){
        case 1 -> "Um";
        case 2 -> "Dois";
        case 3 -> "Tres";
        default -> "Outro";
    };
}