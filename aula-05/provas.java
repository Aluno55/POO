void main (){
    // 4 notas, de 0 a 10
    // usar for each e apresente a média

    double[] notas = new double[3];

for (int i = 1; i <= notas.length; i++) {
    String n = IO.readln("Entre com a " + i + "a. nota: ");
    notas[i]=Integer.parseInt(n);
    }
double soma = 0;
for (double d : notas) {
    soma = soma + d;
    }
IO.println(soma/4);
}