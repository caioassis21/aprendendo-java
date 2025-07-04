package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);

        int codigo;
        double preco = 0;

        System.out.print("Codigo do produto comprado (De 1 a 5): ");
        codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                preco = 5.00;
                break;

            case 2:
                preco = 3.50;
                break;

            case 3:
                preco = 4.80;
                break;

            case 4:
                preco = 8.90;
                break;

            case 5:
                preco = 7.32;
                break;

            default:
                System.out.println("Numero inválido. Digite de 1 a 5.");
        }

        if (preco != 0) {
            System.out.print("Quantidade Comprada: ");
            int quantidadeComprada = scanner.nextInt();

            double valorTotal = quantidadeComprada * preco;

            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        }


        scanner.close();
    }
}
