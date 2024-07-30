package HashMap;

//Escrever um programa que armazena informações de contato (nome, telefone) e permite a busca por nome.

import java.util.HashMap;
import java.util.Scanner;

public class Contato {
    public static void main(String[] args) {
    	
        HashMap<String, String> contactMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        contactMap.put("Ana", "1998765-4532");
        contactMap.put("Bruno", "1991234-5678");
        contactMap.put("Carol", "1998765-0989");

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1, 2 ou 3): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Digite o nome do contato: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Digite o telefone do contato: ");
                    String phone = scanner.nextLine().trim();
                    contactMap.put(name, phone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case "2":
                    System.out.print("Digite o nome do contato para buscar: ");
                    name = scanner.nextLine().trim();
                    if (contactMap.containsKey(name)) {
                        phone = contactMap.get(name);
                        System.out.println("Telefone de " + name + ": " + phone);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case "3":
                    System.out.println("Saindo.");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
