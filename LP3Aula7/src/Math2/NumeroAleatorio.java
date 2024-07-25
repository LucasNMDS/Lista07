package Math2;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // Criando uma instância de Random
        Random random = new Random();

        // Gerando um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Exibindo o número aleatório
        System.out.println("O número sorteado foi " + numeroAleatorio);
    }
}
