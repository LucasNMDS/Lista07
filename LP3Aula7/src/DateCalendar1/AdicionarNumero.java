package DateCalendar1;

//Desenvolver um programa que adiciona um número específico de dias a uma data e exibe a nova data.

import java.time.LocalDate;
import java.util.Scanner;

public class AdicionarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (aaaa-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Digite o número de dias a adicionar: ");
        int diasParaAdicionar = scanner.nextInt();

        LocalDate novaData = data.plusDays(diasParaAdicionar);
        System.out.println("Nova data: " + novaData);

        scanner.close();
    }
}
