void main() {
    Scanner scanner = new Scanner(System.in);

    final double temperatura;
    final String statusTemperatura;

    IO.print("> Digite a temperatura: ");
    temperatura = scanner.nextDouble();

    if (temperatura < 10) {
        statusTemperatura = "muito frio";
    } else if (temperatura < 20) {
        statusTemperatura = "frio";
    } else if (temperatura < 30) {
        statusTemperatura = "agradável";
    } else {
        statusTemperatura = "quente";
    }

    System.out.printf("O clima hoje está: %s.", statusTemperatura);

    scanner.close();
}