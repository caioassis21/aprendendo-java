package estruturarepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (Valor máximo é ate 15): ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        for (int i = numero; i >= 1; i = i--) {

            fatorial = fatorial * i;


        }

        System.out.println("Fatorial = " + fatorial);

        scanner.close();
    }
}
