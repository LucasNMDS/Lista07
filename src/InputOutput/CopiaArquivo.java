package InputOutput;

//Desenvolver um programa que copia o conteúdo de um arquivo para outro.

import java.io.*;

public class CopiaArquivo {
    public static void main(String[] args) {
        String sourceFile = "example.txt";
        String destinationFile = "copy_example.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile));
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("Java I/O Example.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter copyWriter = new BufferedWriter(new FileWriter(destinationFile));
            String line;
            while ((line = reader.readLine()) != null) {
                copyWriter.write(line);
                copyWriter.newLine();
            }
            reader.close();
            copyWriter.close();

            System.out.println("Conteúdo copiado do arquivo " + sourceFile + " para " + destinationFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

