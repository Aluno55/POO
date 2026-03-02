void main (){
    // String num = "2";
    // int a = 10;
    // a= Integer.parseInt(num);
    // double d = Double.parseDouble(num);

    String name = IO.readln("Entre com o seu nome: "),
    ano = IO.readln("Entre com o seu ano de nascimento: ");
    IO.println("Olá " + name + ", você tem" + (2026- Integer.parseInt(ano)) + "anos");
    // printf tbm funciona ou println com string.format; porém ambos precisam usar %s
}