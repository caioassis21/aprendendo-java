package Exemplos;

public class TipoVariaveis {
    public static void main(String[] args) {

        int idadeCliente = 35;
        int anoNascimento = 1989;

        System.out.println("\n--- Inteiros ---");
        System.out.println("Idade do Cliente: " + idadeCliente);
        System.out.println("Ano de Nascimento: " + anoNascimento);

        // Decimais
        double salario = 4500.50;
        double cotacaoDolar = 5.83;

        System.out.println("\n--- Decimais ---"); // \n pula uma linha
        System.out.println("Salário: R$" + salario);
        System.out.println("Cotação Dólar: " + cotacaoDolar);

        // --- Booleanos ---
        boolean clienteAtivo = true;
        boolean possuiDesconto = false;
        System.out.println("\n--- Booleanos ---");
        System.out.println("Cliente está ativo? " + clienteAtivo);
        System.out.println("Possui desconto? " + possuiDesconto);

        // --- Caractere ---
        char genero = 'F'; // 'M' ou 'F' ou 'O' (Outro)
        char avaliacao = 'B'; // Ex: A, B, C, D, E
        System.out.println("\n--- Caractere ---");
        System.out.println("Gênero: " + genero);
        System.out.println("Avaliação: " + avaliacao);

        // --- Texto (String) ---
        String nomeCompleto = "Ana Clara Martins";
        String profissao = "Desenvolvedora Java";

        // Usando a variável profissao dentro de outra String:
        String apresentacao = "Olá, meu nome é " + nomeCompleto + " e sou " + profissao + ".";
        System.out.println("\n--- Texto (String) ---");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Profissão: " + profissao);
        System.out.println(apresentacao);
    }
}
