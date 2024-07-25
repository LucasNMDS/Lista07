package StringBuilder1;

import java.util.Scanner;

public class ArrayPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Usando StringBuilder para construir a string
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            // Solicitando ao usuário para inserir uma palavra
            System.out.print("Digite uma palavra (ou 'stop' para terminar): ");
            String palavra = scanner.nextLine();
            
            // Verificando se a palavra é "stop"
            if (palavra.equalsIgnoreCase("stop")) {
                break;
            }
            
            // Adicionando a palavra ao StringBuilder
            sb.append(palavra).append(" ");
        }
        
        // Convertendo o StringBuilder em uma string
        String frase = sb.toString().trim();
        
        // Exibindo a string resultante
        System.out.println("As palavras digitadas são: " + frase);
        
        scanner.close();
    }
}
