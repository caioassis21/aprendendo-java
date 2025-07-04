package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome01 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade01 = scanner.nextInt();

        System.out.println("\nDados da segunda pessoa:");
        System.out.print("Nome: ");
        scanner.nextLine();
        String nome02 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade02 = scanner.nextInt();

        double mediaDasIdades = (idade01 + idade02) / 2.0;

        System.out.printf("\nA idade media de %s e %s é de %.1f anos%n", nome01, nome02, mediaDasIdades);

        scanner.close();

    }
}
