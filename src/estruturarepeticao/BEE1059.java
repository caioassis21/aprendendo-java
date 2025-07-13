package estruturarepeticao;

import java.util.Scanner;

public class BEE1059 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int contador = 0;

        while (contador < 50) {
            if (numero % 2 != 0) {
                numero = numero + 1;
            }
            System.out.println(numero);
            numero = numero + 2;

            contador = contador + 1;
        }

        scanner = new Scanner(System.in);
    }
}

