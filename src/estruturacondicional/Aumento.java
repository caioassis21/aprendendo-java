package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double porcentagem;

        System.out.print("Digite o salario da pessoa: R$ ");
        double salarioAtual = scanner.nextDouble();

        if (salarioAtual <= 1000) {
            porcentagem = 20;
        } else if (salarioAtual <= 3000) {
            porcentagem = 15;
        } else if (salarioAtual <= 8000) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        double aumento = salarioAtual * porcentagem / 100;

        double novoSalario = salarioAtual + aumento;

        System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.println("Porcentagem = " + porcentagem + " %");

        scanner.close();
    }
}
