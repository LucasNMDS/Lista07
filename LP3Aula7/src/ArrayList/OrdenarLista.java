package ArrayList;

//Desenvolver um programa que ordena uma lista de números inteiros.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarLista {
    public static void main(String[] args) {
    	
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja adicionar? ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        
        Collections.sort(numbers);
        
        System.out.println("Números ordenados: " + numbers);
        
        scanner.close();
    }
}
