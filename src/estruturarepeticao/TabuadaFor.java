package estruturarepeticao;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para mostrar a tabuada dele: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
