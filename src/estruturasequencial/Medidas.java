package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a medida de A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite a medida de B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite a medida de C: ");
        double c = scanner.nextDouble();

        // Area do quadrado
        double areaDoQuadrado = Math.pow(a, 2);

        // Area Triangulo Retangulo
        double areaTrianguloRetangulo = (a * b) / 2.0;

        // Area do trapezio
        double areaDoTrapezio = ((a + b) * c) / 2.0;

        System.out.printf("\nAREA DO QUADRADO: %.4f%n", areaDoQuadrado);
        System.out.printf("AREA DO TRIANGULO RETANGULO: %.4f%n", areaTrianguloRetangulo);
        System.out.printf("AREA DO TRAPEZIO: %.4f%n", areaDoTrapezio);

        scanner.close();
    }
}
