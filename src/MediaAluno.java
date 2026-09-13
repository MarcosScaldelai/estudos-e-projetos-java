void main() {
    Scanner scanner = new Scanner(System.in);

    final double primeiraNota;
    final double segundaNota;
    final double terceiraNota;

    final double media;
    final String situacao;

    IO.print("> Primeira nota: ");
    primeiraNota = scanner.nextDouble();

    IO.print("> Segunda nota: ");
    segundaNota = scanner.nextDouble();

    IO.print("> Terceira nota: ");
    terceiraNota = scanner.nextDouble();

    media = (primeiraNota + segundaNota + terceiraNota) / 3;

    if (media >= 7) {
        situacao = "Aprovado";
    } else if (media >= 5) {
        situacao = "Recuperação";
    } else {
        situacao = "Reprovado";
    }

    System.out.printf("Média: %.2f%n", media);
    System.out.printf("Situação: %s", situacao);

    scanner.close();
}
