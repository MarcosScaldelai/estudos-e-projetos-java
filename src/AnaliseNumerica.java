import java.util.Scanner;

public class AnaliseNumerica {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String SEPARADOR = "======================";

        final int primeiroNumero;
        final int segundoNumero;

        System.out.printf("Bem-vindo(a) ao Sistema de Análise Numérica.%n");

        System.out.printf("%n> Primeiro número: ");
        primeiroNumero = scanner.nextInt();

        System.out.printf("%n> Segundo número: ");
        segundoNumero = scanner.nextInt();

        boolean numerosIguais = primeiroNumero == segundoNumero;
        boolean numerosDiferentes = primeiroNumero != segundoNumero;
        boolean primeiroNumeroMaior = primeiroNumero > segundoNumero;
        boolean segundoNumeroMaior = segundoNumero > primeiroNumero;
        boolean ambosNumerosPositivos = (primeiroNumero > 0) && (segundoNumero > 0);
        boolean ambosNumerosNegativos = (primeiroNumero < 0) && (segundoNumero < 0);
        boolean algumNumeroPar = (primeiroNumero % 2 == 0) || (segundoNumero % 2 == 0);
        boolean ambosNumerosImpares = (primeiroNumero % 2 != 0) && (segundoNumero % 2 != 0);

        boolean ambosMultiplosDeCinco = (primeiroNumero % 5 == 0) && (segundoNumero % 5 == 0);
        boolean umDosNumerosNegativo = (primeiroNumero < 0) || (segundoNumero < 0);
        boolean nenhumIgualZero = (primeiroNumero != 0) && (segundoNumero != 0);


        System.out.printf("%s%n ANÁLISE NUMÉRICA %n%s", SEPARADOR, SEPARADOR);

        System.out.printf(
                "%n%nPrimeiro número: %d%n" +
                "Segundo número: %d%n%n",
                primeiroNumero, segundoNumero
        );

        System.out.printf(
                "Números iguais? %s%n" +
                "Números diferentes? %s%n" +
                "Primeiro número é maior? %s%n" +
                "Segundo número é maior? %s%n" +
                "Ambos são positivos? %s%n" +
                "Ambos são negativos? %s%n" +
                "Pelos menos um número é par? %s%n" +
                "Ambos são ímpares? %s%n%n",
                numerosIguais, numerosDiferentes, primeiroNumeroMaior, segundoNumeroMaior,
                ambosNumerosPositivos, ambosNumerosNegativos, algumNumeroPar, ambosNumerosImpares
        );

        System.out.printf(
                "Ambos são múltiplos de 5? %s%n" +
                "Exatamente um é negativo? %s%n" +
                "Nenhum é igual a zero? %s%n",
                ambosMultiplosDeCinco, umDosNumerosNegativo, nenhumIgualZero
        );

        System.out.printf("%n%s", SEPARADOR);

        scanner.close();
    }

}