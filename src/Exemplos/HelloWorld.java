package Exemplos;

import java.time.Year;
import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declarando e iniciando as nossas variáveis
        String nomeDoFilme = "Big fish";
        int anoDeLancamento = 2003;
        boolean incluidoNoPlano = true;

        // Calcula a quantos anos o filme foi lancado
        int anoAtual = Year.now().getValue(); //Pega o ano atual diretamente do sistema!
        int idadeDoFilme = anoAtual - anoDeLancamento;

        double somaDasNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota do filme: ");
            double notaFilme = sc.nextDouble();
            somaDasNotas = somaDasNotas + notaFilme;
        }

        // Calcula a soma das notas
        double mediaDasNotas = somaDasNotas / 3.0;


        // Exibindo as informações na tela
        System.out.println("\nNome do filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.printf("Media de nota do filme: %.2f%n", mediaDasNotas);
        System.out.println("Idade do filme: " + idadeDoFilme);
        System.out.println("Incluido no plano: " + incluidoNoPlano);

        if (mediaDasNotas > 8.5) {
            System.out.println("Recomendação: Filme aclamado pela crítica! Altamente recomendado.");
        } else {
            System.out.println("Recomendação: Bom filme para assistir.");
        }

    }
}
