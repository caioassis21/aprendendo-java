package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double temperartura;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)?");
        String escala = scanner.next();

        if (escala.equals("F") || escala.equals("f")) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperartura = scanner.nextDouble();

            double temperaturaCelsius = (double) 5 /9 * (temperartura - 32);

            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", temperaturaCelsius);

        } else if (escala.equals("C") || escala.equals("c")) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperartura = scanner.nextDouble();

            double temperaturaFahrenheit = temperartura * ((double) 9 / 5) + 32;

            System.out.printf("Temperatura equivalente em fahrenheit: %.2f%n", temperaturaFahrenheit);
        } else {
            System.out.println("Opção invalida! Escolha F ou C");
        }

        scanner.close();
    }
}
