package Exemplos;

public class EstruturaFor {
    public static void main(String[] args) {

        System.out.println("Iniciando a contagem para o teste de repetição:");

        for (int i = 1; i <= 5; i++) {
            // Esse bloco sera repetido 5 vezes
            System.out.println("Estamos na volta " + i);
        }

        System.out.println("Contagem finalizada!");

        System.out.println("\nTabuada do 10: ");

        int numero = 10;

        for (int i = 1; i <= 10; i++) {
            System.out.println(+ numero + " X " + i + " = " +(numero * i));
        }
    }
}
