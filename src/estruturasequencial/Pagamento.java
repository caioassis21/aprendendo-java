package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor por hora: R$ ");
        double valorDaHora = scanner.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        double valorTotal = valorDaHora * horasTrabalhadas;

        System.out.printf("%nO pagamento para %s deve ser de R$ %.2f%n", nome, valorTotal);

        scanner.close();
    }
}
