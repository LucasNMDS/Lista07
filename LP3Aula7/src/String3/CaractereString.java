package String3;

import java.util.Scanner;

public class CaractereString {
    // Método para encontrar a primeira ocorrência de um caractere em uma string
    public static int encontrarPrimeiraOcorrencia(String str, char ch) {
        // Verifica se a string não é nula e tem conteúdo
        if (str != null && !str.isEmpty()) {
            // Percorre a string para encontrar a primeira ocorrência do caractere
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    return i; // Retorna o índice da primeira ocorrência
                }
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado ou se a string for nula/vazia
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a string
        System.out.print("Digite a string: ");
        String minhaString = scanner.nextLine();

        // Solicita ao usuário o caractere
        System.out.print("Digite o caractere a ser verificado: ");
        char meuCaractere = scanner.next().charAt(0);

        // Chama o método para encontrar a primeira ocorrência
        int indice = encontrarPrimeiraOcorrencia(minhaString, meuCaractere);

        // Exibe o resultado
        if (indice != -1) {
            System.out.println("A primeira ocorrência do caractere '" + meuCaractere + "' está no índice: " + indice);
        } else {
            System.out.println("O caractere '" + meuCaractere + "' não foi encontrado na string.");
        }

        scanner.close();
    }
}
