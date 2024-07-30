package ArrayList;

//Escrever um programa que encontra o maior e o menor valor em uma lista de números.

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
    	
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja adicionar? ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        
        if (numbers.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            int min = numbers.get(0);
            int max = numbers.get(0);
            
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            
            System.out.println("Menor valor: " + min);
            System.out.println("Maior valor: " + max);
        }
        
        scanner.close();
    }
}

