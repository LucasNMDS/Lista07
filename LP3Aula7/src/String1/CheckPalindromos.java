package String1;

import java.util.Scanner;

public class CheckPalindromos {

    public static boolean PalindromeTrue(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) { //Faz a leitura de todos os caracteres e compara

                return false; // Se diferentes, então não é palíndromo. 
            }
            left++;
            right--;

        }
        return true; // Se verdadeiro, então é palíndromo. 
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String input = scanner.nextLine(); 
        scanner.close();
        boolean result = PalindromeTrue(input);

        if (result) {
            System.out.println("'" + input + "' é um palíndromo."); 

        } else {
            System.out.println("'" + input + "' não é um palíndromo.");

        }

    }

}