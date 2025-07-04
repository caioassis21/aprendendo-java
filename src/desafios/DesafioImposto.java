package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Renda anual com salario: R$ ");
        double salarioAnual = scanner.nextDouble();
        System.out.print("Renda anual com prestacao de serviço: R$ ");
        double rendaPrestacaoDeServico = scanner.nextDouble();
        System.out.print("Renda anual com ganho de capital: R$ ");
        double rendaGanhoDeCapital = scanner.nextDouble();
        System.out.print("Gastos medicos: R$ ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Gastos educacionais: R$ ");
        double gastosEducacionais = scanner.nextDouble();

        System.out.println("\nRELATORIO DE IMPOSTO DE RENDA");

        double porcentagem;
        double salarioMensal = salarioAnual / 12;

        if (salarioMensal < 3000) {
            porcentagem = 0;
        } else if (salarioMensal < 5000) {
            porcentagem = 10;
        } else {
            porcentagem = 20;
        }

        double impostoSalario = salarioAnual * porcentagem / 100;
        double impostoServico = rendaPrestacaoDeServico * 15 / 100;
        double impostoGanhoCapital = rendaGanhoDeCapital * 20 / 100;

        System.out.println("\nCONSOLIDADE DE RENDA:");

        if (salarioMensal < 3000) {
            System.out.println("Imposto sobre salario: Isento");
        } else {
            System.out.printf("Imposto sobre salario: R$ %.2f%n", impostoSalario);
        }
        System.out.printf("Imposto sobre serviços: R$ %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", impostoGanhoCapital);

        double impostoBruto = impostoSalario + impostoServico + impostoGanhoCapital;
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        double maximoDedutiveis = impostoBruto * 30 / 100;

        System.out.println("\nDEDUÇÕES:");
        System.out.printf("Máximo dedutivel: R$ %.2f%n", maximoDedutiveis);
        System.out.printf("Gasto dedutiveis: R$ %.2f%n", gastosDedutiveis);

        double abatimento;

        System.out.println("\nRESUMO:");
        System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
        if (gastosDedutiveis < maximoDedutiveis) {
            abatimento = gastosDedutiveis;
        } else {
            abatimento = maximoDedutiveis;
        }

        System.out.printf("Abatimento: R$ %.2f%n", abatimento);
        double impostoDevido = impostoBruto - abatimento;
        System.out.printf("Imposto devido: R$ %.2f%n", impostoDevido);

        scanner.close();

    }
}
