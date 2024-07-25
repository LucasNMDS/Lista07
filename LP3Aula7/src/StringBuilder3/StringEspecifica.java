package StringBuilder3;

import java.util.Scanner;

public class StringEspecifica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a string original
        System.out.print("Digite a string original: ");
        String originalString = scanner.nextLine();

        // Solicitando ao usuário a string a ser inserida
        System.out.print("Digite a string a ser inserida: ");
        String stringToInsert = scanner.nextLine();

        // Solicitando ao usuário a posição onde a string deve ser inserida
        System.out.print("Digite a posição onde a string deve ser inserida: ");
        int position = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Usando StringBuilder para inserir a string
        StringBuilder sb = new StringBuilder(originalString);

        // Inserindo a string na posição especificada
        if (position >= 0 && position <= originalString.length()) {
            sb.insert(position, stringToInsert);
        } else {
            System.out.println("Posição inválida.");
            return;
        }

        // Convertendo o StringBuilder em uma string
        String result = sb.toString();

        // Exibindo a string resultante
        System.out.println("A string resultante é: " + result);

        scanner.close();
    }
}

