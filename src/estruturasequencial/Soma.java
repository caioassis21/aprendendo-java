package estruturasequencial;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
