package estruturarepeticao;

import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos numeros voce vai digitar: ");
        int numerosDigitados = scanner.nextInt();

        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= numerosDigitados; i++) {
            System.out.println("Numeros digitados: ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro = dentro + 1;
            } else {
                fora = fora + 1;
            }
        }

        System.out.println(dentro + " Dentro");
        System.out.println(fora + " Fora");

        scanner.close();


    }
}
