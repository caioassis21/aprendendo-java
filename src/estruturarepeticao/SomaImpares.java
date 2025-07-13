package estruturarepeticao;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        int numero01 = scanner.nextInt();
        int numero02 = scanner.nextInt();

        int menor;
        int maior;

        if (numero01 < numero02) {
            menor = numero01;
            maior = numero02;
        } else {
            menor = numero02;
            maior = numero01;
        }

        int soma = 0;

        for (int i = menor + 1; i < maior; i++) {

            if (i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos impares: " + soma);

        scanner.close();
    }
}


