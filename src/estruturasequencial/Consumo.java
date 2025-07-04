package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDistancia percorrida: ");
        int distanciaPercorrida = scanner.nextInt();
        System.out.print("Combustivel gasto: ");
        double combustivelGasto = scanner.nextDouble();

        // Calcula o consumo medio
        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("Consumo medio: %.3f%n", consumoMedio);

        scanner.close();
    }
}
