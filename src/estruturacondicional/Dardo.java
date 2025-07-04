package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double distancia01 = scanner.nextDouble();
        double distancia02 = scanner.nextDouble();
        double distancia03 = scanner.nextDouble();

        double maiorDistancia;

        if (distancia01 >= distancia02 && distancia01 >= distancia03) {
            maiorDistancia = distancia01;
        } else if (distancia02 >= distancia03) {
            maiorDistancia = distancia02;
        } else {
            maiorDistancia = distancia03;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maiorDistancia);

        scanner.close();
    }
}
