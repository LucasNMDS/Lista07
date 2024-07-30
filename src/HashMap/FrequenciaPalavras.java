package HashMap;

//Desenvolver um programa que conta a frequência de palavras em um texto.

import java.util.HashMap;
import java.util.Scanner;

public class FrequenciaPalavras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto (pressione Enter para terminar):");

        StringBuilder textBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            textBuilder.append(line).append(" ");
        }
        scanner.close();

        String text = textBuilder.toString();
        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Frequência das palavras:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

