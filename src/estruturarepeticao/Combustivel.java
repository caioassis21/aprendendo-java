package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;


        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim)");

        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = scanner.nextInt();

        while (codigo != 4) {

            switch (codigo) {
                case 1:
                    quantidadeAlcool = quantidadeAlcool + 1;
                    break;

                case 2:
                    quantidadeGasolina = quantidadeGasolina + 1;
                    break;

                case 3:
                    quantidadeDiesel = quantidadeDiesel + 1;
                    break;

            }

            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
            codigo = scanner.nextInt();

        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);

        scanner.close();

    }
}
