package Wrapper2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();

        System.out.println("Quantos números você quer inserir?");
        int numCount = scanner.nextInt();

        for (int i = 0; i < numCount; i++) {
            System.out.println("Digite o número #" + (i + 1) + ":");
            int number = scanner.nextInt();
            intList.add(number);
        }

        int sum = 0;
        for (int num : intList) {
            sum += num;
        }
        
        double average = (double) sum / intList.size();

        System.out.println("A soma dos números é: " + sum);
        System.out.println("A média dos números é: " + average);
        scanner.close();
    }
}
