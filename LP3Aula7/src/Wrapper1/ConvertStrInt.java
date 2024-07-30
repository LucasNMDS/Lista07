package Wrapper1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ConvertStrInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();

        System.out.println("Quantas strings você quer inserir?");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // 

        for (int i = 0; i < numStrings; i++) {
            System.out.println("Digite a string #" + (i + 1) + ":");
            String input = scanner.nextLine();
            stringList.add(input);
        }

        List<Integer> intList = new ArrayList<>();
        for (String s : stringList) {
            try {
                intList.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("A string \"" + s + "\" não é um número válido e será ignorada.");
            }
        }

        System.out.println("Lista de inteiros:");
        for (Integer i : intList) {
            System.out.println(i);
        }

        scanner.close();
    }
}


