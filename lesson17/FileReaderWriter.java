package com.company.lesson17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {

        //File file = new File("a.txt");
        try (FileReader fileReader = new FileReader("a.txt");
             FileWriter fileWriter = new FileWriter("b.txt")) {

            char[] ch = new char[50];
            int size = fileReader.read(ch);
            for (int i = 0; i < size; i++) {
                fileWriter.write(ch[i]);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
