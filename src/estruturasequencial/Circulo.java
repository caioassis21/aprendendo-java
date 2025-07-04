package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        // Calcula a area do circulo
        double areaCirculo = Math.PI * (Math.pow(raio, 2));

        System.out.printf("AREA = %.3f%n", areaCirculo);

        scanner.close();
    }
}
