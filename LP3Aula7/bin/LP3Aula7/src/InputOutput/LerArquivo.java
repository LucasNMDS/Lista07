package InputOutput;

//Criar um programa que lê um arquivo de texto linha por linha e imprime o conteúdo no console.

import java.io.*;

public class LerArquivo {
    public static void main(String[] args) {
        try {
        	
            BufferedWriter writer = new BufferedWriter(new FileWriter("exemplo.txt"));
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("Java I/O Example.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

