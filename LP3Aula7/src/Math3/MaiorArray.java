package Math3;

import java.util.Scanner;

public class MaiorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        // Criando o array
        int[] array = new int[tamanho];

        // Solicitando ao usuário os valores do array
        System.out.println("Digite os valores do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Inicializando o maior valor com o primeiro elemento do array
        int maiorValor = array[0];

        // Iterando pelo array para encontrar o maior valor
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }
        }

        // Exibindo o maior valor encontrado
        System.out.println("O maior valor no array é: " + maiorValor);

        scanner.close();
    }
}

