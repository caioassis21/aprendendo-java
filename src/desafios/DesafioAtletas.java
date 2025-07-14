package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a quantidade de atletas: ");
        int quantidadeAtletas = scanner.nextInt();

        int quantidadeDeHomens = 0;
        int quantidadeDeMulheres = 0;

        double totalPeso = 0;
        double maiorAltura = 0;
        double totalAlturaMulheres = 0;

        String nomeAtletaMaisAlto = "";

        for (int i = 1; i <= quantidadeAtletas; i++) {
            System.out.println("Digite os dados do atleta numero " + i);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sexo: ");
            char sexo = scanner.next().charAt(0);
            while (sexo != 'M' && sexo != 'm' && sexo != 'f' && sexo != 'F') {
                System.out.println("Valor invalido! Favor digitar F ou M:");
                sexo = scanner.next().charAt(0);
            }

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = scanner.nextDouble();
            }


            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = scanner.nextDouble();
            }

            if (sexo == 'f' || sexo == 'F') {
                quantidadeDeMulheres = quantidadeDeMulheres + 1;
                totalAlturaMulheres = totalAlturaMulheres + altura;

            } else {
                quantidadeDeHomens = quantidadeDeHomens + 1;
            }

            if (maiorAltura < altura) {
                maiorAltura = altura;
                nomeAtletaMaisAlto = nome;
            }


            totalPeso = totalPeso + peso;

        }

        double mediaPesoAtletas = totalPeso / quantidadeAtletas;
        double porcentagemDeHomens = ((double) quantidadeDeHomens / quantidadeAtletas) * 100.0;


        System.out.println("\n\nRelatorio: ");
        System.out.printf("Peso médio dos atletas: %.2f%n", mediaPesoAtletas);
        System.out.println("Atleta mais alto: " + nomeAtletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f%%%n", porcentagemDeHomens);

        if (quantidadeDeMulheres == 0) {
            System.out.println("Não há mulheres cadastradas");
        } else {
            double alturaMediaMulheres = totalAlturaMulheres / quantidadeDeMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        }

        scanner.close();

    }
}
