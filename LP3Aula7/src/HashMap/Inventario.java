package HashMap;

//Criar um programa que gerencia um inventário de produtos, permitindo adicionar, remover e buscar produtos pelo nome.

import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    private HashMap<String, Integer> inventario;

    public Inventario() {
        inventario = new HashMap<>();
    }

    public void addProduto(String name, int quantity) {
        inventario.put(name, quantity);
        System.out.println("Produto adicionado: " + name + " com quantidade: " + quantity);
    }

    public void removerProduto(String name) {
        if (inventario.containsKey(name)) {
            inventario.remove(name);
            System.out.println("Produto removido: " + name);
        } else {
            System.out.println("Produto não encontrado: " + name);
        }
    }

    public void buscarProduto(String name) {
        if (inventario.containsKey(name)) {
            System.out.println("Produto encontrado: " + name + " com quantidade: " + inventario.get(name));
        } else {
            System.out.println("Produto não encontrado: " + name);
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventário:");
        for (String product : inventario.keySet()) {
            System.out.println("Produto: " + product + ", Quantidade: " + inventario.get(product));
        }
    }

    public static void main(String[] args) {
        Inventario manager = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Mostrar inventário");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String addName = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int addQuantity = scanner.nextInt();
                    manager.addProduto(addName, addQuantity);
                    break;
                case 2:
                    System.out.print("Nome do produto a remover: ");
                    String removeName = scanner.nextLine();
                    manager.removerProduto(removeName);
                    break;
                case 3:
                    System.out.print("Nome do produto a buscar: ");
                    String searchName = scanner.nextLine();
                    manager.buscarProduto(searchName);
                    break;
                case 4:
                    manager.mostrarInventario();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
