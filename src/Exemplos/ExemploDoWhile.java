package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resposta;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temepraturaCelsius = scanner.nextDouble();
            double temperaturaFahrenheit = ((9 * temepraturaCelsius) / 5) + 32;
            System.out.printf("Temperatura Equivalente a Fahrenheit: %.2f%n", temperaturaFahrenheit);
            System.out.println("Deseja repetir o programa (s - sim / n - nao)");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');

        scanner.close();
    }
}
