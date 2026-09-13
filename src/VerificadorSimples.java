void main() {
    Scanner scanner = new Scanner(System.in);

    final int numero;

    IO.print("> Digite um número: ");
    numero = scanner.nextInt();

    if (numero > 0) {
        System.out.printf("O número é positivo.%n");
    } else if (numero < 0) {
        System.out.printf("O número é negativo.%n");
    } else {
        System.out.printf("O número é zero.%n");
    }

    if (numero % 2 == 0) {
        System.out.printf("O número é par.%n");
    } else {
        System.out.printf("O número é ímpar.%n");
    }

    scanner.close();
}
