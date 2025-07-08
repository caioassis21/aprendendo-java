package estruturarepeticao;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senhaAcesso = 2002;

        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();

        while (senha != senhaAcesso) {
            System.out.print("Senha inválida! Tente novamente: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso permitido!");

        scanner.close();
    }
}
