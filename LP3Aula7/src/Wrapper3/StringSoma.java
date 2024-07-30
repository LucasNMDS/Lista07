package Wrapper3;

import java.util.Scanner;

public class StringSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string de números separados por espaços:");
        String numberString = scanner.nextLine();

        String[] numberStrings = numberString.split(" ");

        int sum = 0;
        for (String s : numberStrings) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("A string \"" + s + "\" não é um número válido e será ignorada.");
            }
        }

        System.out.println("A soma total dos números é: " + sum);

        scanner.close();
    }
}
