package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        while (numero != 0) {

            if (numero % 2 != 0) {
                numero = numero + 1;
            }

            int contador = 0;
            int soma = 0;

            while (contador < 5) {
                soma = soma + numero;
                numero = numero + 2;
                contador = contador + 1;
            }

            System.out.println("Soma = " + soma);

            System.out.println("Digite um numero inteiro: ");
            numero = scanner.nextInt();
        }

        scanner.close();

    }
}