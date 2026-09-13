import java.util.Scanner;

public class MaiorNumero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;

        int maiorNumero;

        System.out.print("> Primeiro número: ");
        primeiroNumero = scanner.nextInt();

        System.out.print("> Segundo número: ");
        segundoNumero = scanner.nextInt();

        System.out.print("> Terceiro número: ");
        terceiroNumero = scanner.nextInt();

        maiorNumero = primeiroNumero;

        if (segundoNumero > maiorNumero) {
            maiorNumero = segundoNumero;
        } if (terceiroNumero > maiorNumero) {
            maiorNumero = terceiroNumero;
        } if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
            System.out.println("Os três números são iguais.");
        } else {
            System.out.printf("O maior número é: %s%n", maiorNumero);
        }

        scanner.close();
    }
}
