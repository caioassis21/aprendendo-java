package estruturarepeticao;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int soma = 0;

        while (numero != 0) {

             soma = soma + numero;

             numero = scanner.nextInt();
        }

        System.out.println("Soma = " + soma);

        scanner.close();

    }
}