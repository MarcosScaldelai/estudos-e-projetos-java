void main() {
    Scanner scanner = new Scanner(System.in);

    int numero;
    int soma = 0;
    int contador = 1;

    while (contador <= 5) {
        System.out.printf("> Digite o %dº número: ", contador);
        numero = scanner.nextInt();

        soma += numero;

        contador++;
    }

    double media = soma / 5.0;
    String situacao;

    if (media >= 15) {
        situacao = "Média excelente";
    } else if (media >= 10) {
        situacao = "Média ideal";
    } else if (media >= 5) {
        situacao = "Média boa";
    } else {
        situacao = "Média ruim";
    }

    System.out.printf("Soma: %d%n", soma);
    System.out.printf("Média: %.2f%n", media);
    System.out.printf("Situação: %s", situacao);

    scanner.close();
}
