void main() {
    Scanner scanner = new Scanner(System.in);

    int numero;

    int numerosPositivos = 0;
    int numerosNegativos = 0;
    int zeros = 0;

    int contador = 1;

    while (contador <= 5) {
        System.out.printf("> Digite o %dº número: ", contador);
        numero = scanner.nextInt();

        if (numero > 0) {
            numerosPositivos++;
        } else if (numero < 0) {
            numerosNegativos++;
        } else {
            zeros++;
        }

        contador++;
    }

    System.out.printf("Positivos: %d%n", numerosPositivos);
    System.out.printf("Negativos: %d%n", numerosNegativos);
    System.out.printf("Zeros: %d%n", zeros);

    scanner.close();
}
