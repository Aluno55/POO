
void main(){

    int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            IO.println(matriz[i][j]);
        }
        }

    // int i = 10;
    // String resultado;
    // switch (i) {
    //     case 1:
    //         resultado = "um";
    //         break;
    //     case 2:
    //         resultado = "dois";
    //         break;
    //     case 3:
    //         resultado = "tres";
    //         break;
    //     default:
    //         resultado = "outro valor";
    // }
    // IO.println(resultado);
    // String s = switch(i){
    //     case 1 -> "Um";
    //     case 2 -> "Dois";
    //     case 3 -> "Tres";
    //     default -> "Outro";
    // };
}