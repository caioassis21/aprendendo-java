package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a largura do terreno: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = scanner.nextDouble();

        // Calcula a area do terreno
        double areaTerreno = largura * comprimento;

        // Calcula preco do terreno
        double precoTerreno = areaTerreno * valorMetroQuadrado;

        System.out.printf("Area do terreno = %.2f%n", areaTerreno);
        System.out.printf("Preco do terreno = R$ %.2f%n",precoTerreno);

        scanner.close();
    }
}
