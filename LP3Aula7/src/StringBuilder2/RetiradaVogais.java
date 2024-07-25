package StringBuilder2;

import java.util.Scanner;

public class RetiradaVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Usando StringBuilder para remover as vogais
        StringBuilder sb = new StringBuilder();

        // Iterando por cada caractere na string de entrada
        for (char c : input.toCharArray()) {
            // Verificando se o caractere não é uma vogal
            if (!isVogal(c)) {
                sb.append(c);
            }
        }

        // Convertendo o StringBuilder em uma string
        String resultado = sb.toString();

        // Exibindo a string resultante
        System.out.println("String sem vogais: " + resultado);

        scanner.close();
    }

    // Método para verificar se um caractere é uma vogal
    private static boolean isVogal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
