package ArrayList;

//Criar um programa que gerencia uma lista de tarefas, permitindo adicionar, remover e listar tarefas.

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLista {
    public static void main(String[] args) {
    	
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma tarefa para adicionar: ");
        tasks.add(scanner.nextLine());
        
        System.out.print("Digite outra tarefa para adicionar: ");
        tasks.add(scanner.nextLine());
        
        System.out.println("Tarefas: " + tasks);
        
        System.out.print("Digite o índice da tarefa para remover (começando de 0): ");
        int indexToRemove = scanner.nextInt();
        scanner.nextLine();
        if (indexToRemove >= 0 && indexToRemove < tasks.size()) {
            tasks.remove(indexToRemove);
        } else {
            System.out.println("Índice inválido.");
        }
        
        System.out.println("Tarefas atualizadas: " + tasks);
        
        scanner.close();
    }
}
