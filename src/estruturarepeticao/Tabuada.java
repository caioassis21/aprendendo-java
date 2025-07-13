package estruturarepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja a tabuada de qual valor? ");
        int numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i) );
        }

        scanner.close();
    }
}
