package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de minutos: ");
        int quantidadeDeMinutos = scanner.nextInt();

        double valor;

        if (quantidadeDeMinutos <= 100) {

            valor = 50.00;

        } else {
            valor = ((quantidadeDeMinutos - 100) * 2) + 50;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        scanner.close();
    }
}
