package DateCalendar1;

//Escrever um programa que verifica se uma data é antes ou depois de outra data.

import java.time.LocalDate;
import java.util.Scanner;

public class VerificarData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (aaaa-mm-dd): ");
        LocalDate data1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Digite a segunda data (aaaa-mm-dd): ");
        LocalDate data2 = LocalDate.parse(scanner.nextLine());

        if (data1.isBefore(data2)) {
            System.out.println("A primeira data é antes da segunda data.");
        } else if (data1.isAfter(data2)) {
            System.out.println("A primeira data é depois da segunda data.");
        } else {
            System.out.println("As duas datas são iguais.");
        }

        scanner.close();
    }
}
