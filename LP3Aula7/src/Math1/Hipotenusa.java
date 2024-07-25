package Math1;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário os comprimentos dos catetos
        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Calculando a hipotenusa usando o teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Exibindo o resultado
        System.out.printf("A hipotenusa do triângulo retângulo é: %.2f%n", hipotenusa);

        scanner.close();
    }
}

