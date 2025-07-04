package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String classificacao;

        System.out.print("Digite a medida da glicose: ");
        double medidaDaGlicose = scanner.nextDouble();

        if (medidaDaGlicose <= 100) {
            classificacao = "Normal";
        } else if (medidaDaGlicose <= 140) {
            classificacao = "Elevado";
        } else {
            classificacao = "Diabetes";
        }

        System.out.println("Classificacao: " + classificacao);

        scanner.close();
    }
}
