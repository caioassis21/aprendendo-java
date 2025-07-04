package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preco unitario do produto: R$ ");
        double precoUnitario = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();
        System.out.print("Dinheiro recebido: R$ ");
        double dinheiroRecebido = scanner.nextDouble();

        double troco;

        if (dinheiroRecebido >= (precoUnitario * quantidadeComprada)) {
            troco = dinheiroRecebido - (precoUnitario * quantidadeComprada);

            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double valorFaltante = (precoUnitario * quantidadeComprada) - dinheiroRecebido;

            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", valorFaltante);
        }

        scanner.close();

    }
}
