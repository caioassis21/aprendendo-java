package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPreco unitario do produto: R$ ");
        double precoUnitarioProduto = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();
        System.out.print("Dinheiro recebido: R$ ");
        double dinheiroRecebido = scanner.nextDouble();

        // Calcula o troco
        double troco = dinheiroRecebido - (precoUnitarioProduto * quantidadeComprada);

        System.out.printf("Troco = R$ %.2f%n", troco);

        scanner.close();
    }
}
