package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int totalJogos = 0;

        int novoGrenal;

        do {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                vitoriasInter = vitoriasInter + 1;
            } else if (golsGremio > golsInter) {
                vitoriasGremio = vitoriasGremio + 1;
            } else {
                empates = empates + 1;
            }

            totalJogos = totalJogos + 1;

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = scanner.nextInt();

        } while (novoGrenal != 2);

        System.out.println(totalJogos + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }
}
