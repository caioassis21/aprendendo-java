package estruturasequencial;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a duracao em segundos: ");
        int duracao = scanner.nextInt();

        int horas = duracao / 3600;

        duracao = duracao % 3600;

        int minutos = duracao / 60;

        duracao = duracao % 60;

        int segundos = duracao;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        scanner.close();
    }
}
