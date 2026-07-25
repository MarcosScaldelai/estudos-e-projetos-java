import java.util.Scanner;

public class VerificacaoMaioridade {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SEPARADOR = "======================";
        final String nomeUsuario;
        final int idadeUsuario;
        String situacao = "";

        System.out.printf("Bem-vindo(a) ao Sistema de Verificação de Maioridade.%n");

        System.out.printf("%n> Nome: ");
        nomeUsuario = scanner.nextLine();

        System.out.printf("%n> Idade: ");
        idadeUsuario = scanner.nextInt();

        boolean maiorDeIdade = idadeUsuario >= 18;
        boolean menorDeIdade = idadeUsuario < 18;
        boolean maioridade = false;

        if (menorDeIdade) {
            situacao = "MENOR";
        } if (maiorDeIdade) {
            maioridade = true;
            situacao = "MAIOR";
        }

        System.out.printf("%s%nVERIFICAÇÃO DE MAIORIDADE%n%s%n%n", SEPARADOR, SEPARADOR);

        System.out.printf("Nome: %s%nIdade: %s%n%n", nomeUsuario, idadeUsuario);

        System.out.printf("Resultado:%nA pessoa informada é %s de idade.%n", situacao);

        if (maioridade) {
            System.out.printf("Pode iniciar o processo para obter a CNH.%n");
        }

        System.out.printf("%n%s", SEPARADOR);

        scanner.close();
    }

}
