import java.util.Scanner;

public class ClassificadorDeTemperatura {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double temperatura;
        final String statusTemperatura;

        System.out.print("> Digite a temperatura: ");
        temperatura = scanner.nextDouble();

        if (temperatura < 10) {
            statusTemperatura = "muito frio";
        } else if (temperatura >= 10 && temperatura < 20) {
            statusTemperatura = "frio";
        } else if (temperatura >= 20 && temperatura < 30) {
            statusTemperatura = "agradável";
        } else {
            statusTemperatura = "quente";
        }

        System.out.printf("O clima hoje está: %s.", statusTemperatura);
    }
}