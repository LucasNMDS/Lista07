package InputOutput;

//Escrever um programa que grava um array de strings em um arquivo, com cada string em uma nova linha.

import java.io.*;

public class GravarArray {
    public static void main(String[] args) {
    	
        String[] data = {
            "Primeira linha",
            "Segunda linha",
            "Terceira linha",
            "Quarta linha"
        };

        String fileName = "array_output.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();

            System.out.println("Array de strings gravado em " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
