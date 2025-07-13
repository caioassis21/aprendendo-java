package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Experiencia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos de teste serao digitados? ");
        int quantidadeCasosDeTeste = scanner.nextInt();

        int totalCoelhos = 0;
        int totalRato = 0;
        int totalSapo = 0;
        int quantidadeCobaias = 0;

        String tipoCobaia;

        for (int i = 1; i <= quantidadeCasosDeTeste; i++) {
            System.out.print("Quantidade de cobaias: ");
            quantidadeCobaias = scanner.nextInt();
            System.out.print("Tipo de cobaias (C.coelho R.rato S.sapo): ");
            tipoCobaia = scanner.next();

            if (tipoCobaia.equals("c") || tipoCobaia.equals("C")) {
                totalCoelhos = totalCoelhos + quantidadeCobaias;
            } else if (tipoCobaia.equals("r") || tipoCobaia.equals("R")) {
                totalRato = totalRato + quantidadeCobaias;

            } else if (tipoCobaia.equals("s") || tipoCobaia.equals("S")) {
                totalSapo = totalSapo + quantidadeCobaias;
            }
        }

        int totalCobaias = totalCoelhos + totalRato + totalSapo;

        double percentualCoelhos = ((double) totalCoelhos / totalCobaias) * 100.0;
        double percentualSapos = ((double) totalSapo / totalCobaias) * 100.0;
        double percentualRatos = ((double) totalRato / totalCobaias) * 100;

        System.out.println("\nRelatório Final: ");
        System.out.println("Total: " + totalCobaias);
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de sapos: " + totalSapo);
        System.out.println("Total de ratos: " + totalRato);
        System.out.printf("Percentual de coelhos: %.2f%%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f%%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f%%%n", percentualSapos);

        scanner.close();

    }
}
