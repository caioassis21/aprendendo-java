package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploWhileTemperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char escolha = 's';

        while (escolha != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = sc.nextDouble();

            double temperaturaFahrenheit = ((9 * temperaturaCelsius) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", temperaturaFahrenheit);

            System.out.println("Deseja repetir (s - sim / n - nao) ? ");
            escolha = sc.next().charAt(0);

        }



    }
}
