package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeDoFilme = "Big fish";
        double somaDasAvaliacoes = 0;
        int totalDasAvaliacoes = 0;

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n----------- Bem vindo ao Movie Flix ---------");
            System.out.println("Filme em destaque: " + nomeDoFilme);
            System.out.println("1 - Registrar nova avaliação");
            System.out.println("2 - Exibir média das avaliações");
            System.out.println("3 - Sair");
            System.out.print("Digite uma das opções: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a sua avaliação (0 a 10): ");
                double nota = scanner.nextDouble();
                somaDasAvaliacoes = somaDasAvaliacoes + nota;
                totalDasAvaliacoes = totalDasAvaliacoes + 1;

            } else if (opcao == 2) {
                if (totalDasAvaliacoes > 0) {
                    double mediaDasAvaliacoes = somaDasAvaliacoes / totalDasAvaliacoes;
                    System.out.printf("A media atual do filme é: %.2f%n", mediaDasAvaliacoes);
                } else {
                    System.out.println("Nenhuma avaliação foi registrada ainda.");
                }
            } else if (opcao != 3) {
                System.out.println("Opção Inválida! Tente novamente!");
            }

        }

        System.out.println("\nObrigado por usar o Movie-Flix! Volte sempre.");

        scanner.close();
    }
}
