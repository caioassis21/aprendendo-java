package estruturacondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int numero01 = scanner.nextInt();
        int numero02 = scanner.nextInt();

        if (numero01 % numero02 == 0 || numero02 % numero01 == 0) {
            System.out.printf("Os numeros %d e %d são multiplos", numero01, numero02);
        } else {
            System.out.printf("Os numeros %d e %d não são multiplos", numero01, numero02);
        }

        scanner.close();
    }
}
