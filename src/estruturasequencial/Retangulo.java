package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBase do retangulo: ");
        double baseRetangulo = scanner.nextDouble();
        System.out.print("Altura do retangulo: ");
        double alturaRetangulo = scanner.nextDouble();

        // Calcula a area do retangulo
        double area = baseRetangulo * alturaRetangulo;

        // Calcula o perimetro do retangulo
        double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);

        // Calcula a diagonal do retangulo
        double diagonalRetangulo = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetroRetangulo);
        System.out.printf("DIAGONAL = %.4f%n", diagonalRetangulo);

        scanner.close();
    }
}
