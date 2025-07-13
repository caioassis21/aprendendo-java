package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int quantidadeDeCasos = scanner.nextInt();

        double numero01;
        double numero02;
        double numero03;

        double media;

        for (int i = 0; i < quantidadeDeCasos; i++) {
            System.out.println("Digite tres numeros");
            numero01 = scanner.nextDouble();
            numero02 = scanner.nextDouble();
            numero03 = scanner.nextDouble();

            media = (numero01 * 2 + numero02 * 3 + numero03 * 5) / 10.0;
            System.out.printf("MEDIA = %.1f%n", media);
        }

        scanner.close();
    }
}
