package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble();

        double notaFinal = nota01 + nota02;

        System.out.printf("Nota Final: %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}
