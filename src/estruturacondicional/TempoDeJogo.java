package estruturacondicional;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Horario Inicial: ");
        int horarioInicial = scanner.nextInt();
        System.out.print("Horario Final: ");
        int horarioFinal = scanner.nextInt();

        int duracao;

        if (horarioInicial > horarioFinal) {
            duracao = (24 - horarioInicial) + horarioFinal;
        } else if (horarioInicial < horarioFinal) {
            duracao = (horarioFinal - horarioInicial);
        } else {
            duracao = 24;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        scanner.close();
    }
}
