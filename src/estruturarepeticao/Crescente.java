package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }

            System.out.println("Digite dois numeros: ");
            x = scanner.nextInt();
            y = scanner.nextInt();

        }

        scanner.close();
    }
}
