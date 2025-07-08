package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble();

        while (nota01 < 0 || nota01 > 10) {
            System.out.println("Valor invalido! Tente novamente: ");
            nota01 = scanner.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble();

        while (nota02 < 0 || nota02 > 10) {
            System.out.println("Valor invalido! Tente novamente: ");
            nota02 = scanner.nextDouble();
        }

        double media = (nota01 + nota02) / 2.0;

        System.out.printf("MEDIA = %.2f%n", media);

        scanner.close();
    }
}
