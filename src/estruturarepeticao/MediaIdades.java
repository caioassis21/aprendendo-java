package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        System.out.println("Digite as idades: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            while (idade >= 0) {
                soma = soma + idade;
                contador = contador + 1;

                idade = scanner.nextInt();
            }

            double media = (double) soma / contador;

            System.out.printf("MEDIA = %.2f%n", media);
        }

        scanner.close();

    }
}
