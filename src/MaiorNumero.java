void main() {
    Scanner scanner = new Scanner(System.in);

    int primeiroNumero;
    int segundoNumero;
    int terceiroNumero;

    int maiorNumero;

    IO.print("> Primeiro número: ");
    primeiroNumero = scanner.nextInt();

    IO.print("> Segundo número: ");
    segundoNumero = scanner.nextInt();

    IO.print("> Terceiro número: ");
    terceiroNumero = scanner.nextInt();

    maiorNumero = primeiroNumero;

    if (segundoNumero > maiorNumero) {
        maiorNumero = segundoNumero;
    }
    if (terceiroNumero > maiorNumero) {
        maiorNumero = terceiroNumero;
    }
    if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
        IO.println("Os três números são iguais.");
    } else {
        System.out.printf("O maior número é: %d%n", maiorNumero);
    }

    scanner.close();
}
