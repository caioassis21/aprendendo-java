package estruturarepeticao;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas X e Y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            } else {
                System.out.println("Quadrante Q4");
            }
            System.out.println("Digite os valores das coordenadas X e Y:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();
    }
}
