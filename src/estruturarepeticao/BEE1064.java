package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumerosPositivos = 0;
        double totalNumeroPositivo = 0;

        for (int i = 0; i < 6; i++) {
            double numero = scanner.nextDouble();

            if (numero > 0) {
                quantidadeNumerosPositivos = quantidadeNumerosPositivos + 1;
                totalNumeroPositivo = totalNumeroPositivo + numero;

            }

        }

        double mediaNumerosPositivos = totalNumeroPositivo / quantidadeNumerosPositivos;

        System.out.printf("%d valores positivos%n", quantidadeNumerosPositivos);
        System.out.printf("%.1f%n", mediaNumerosPositivos);

        scanner.close();

    }
}
