package estruturarepeticao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumerosDigitados = scanner.nextInt();


        for (int i = 0; i < quantidadeNumerosDigitados; i++) {

            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0 && numero > 0) {
                System.out.println("Par positivo");
            } else if (numero % 2 == 0 && numero < 0) {
                System.out.println("Par negativo");
            } else if (numero % 2 != 0 && numero > 0) {
                System.out.println("Impar positivo");
            } else if (numero % 2 != 0 && numero < 0) {
                System.out.println("Impar negativo");
            } else {
                System.out.println("Nulo");
            }

        }

        scanner.close();
    }
}
