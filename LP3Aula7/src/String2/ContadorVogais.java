package String2;

import java.util.Scanner;

public class ContadorVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contadorVogais = contarVogais(texto);

        System.out.println("Número de vogais na string: " + contadorVogais);
        scanner.close();
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "aeiouAEIOU"; 

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
