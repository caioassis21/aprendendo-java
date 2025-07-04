package estruturacondicional;

import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int valor01 = scanner.nextInt();
        System.out.print("Segundo valor: ");
        int valor02 = scanner.nextInt();
        System.out.print("Terceiro valor: ");
        int valor03 = scanner.nextInt();

        int menor;

        if (valor01 <= valor02 && valor01 <= valor03) {
            menor = valor01;
        } else if (valor02 <= valor03) {
            menor = valor02;
        } else {
            menor = valor03;
        }

        System.out.println("MENOR = " + menor);

        scanner.close();
    }
}
