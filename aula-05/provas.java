void main (){
    // 4 notas, de 0 a 10
    // usar for each e apresente a média

    double[] notas = new double[4];

for (int i = 0; i < notas.length; i++) {
    notas[i] = Double.parseDouble(IO.readln("Entre com a " + (i+1) + "a. nota: "));
    // if (notas[i] > 10 || notas[i] < 0)
    }
double soma = 0;
for (double d : notas) {
    soma += d;
    }
IO.println("Média: " + Math.round(soma/4));
}