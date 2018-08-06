package com.company.lesson17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {


        try (FileReader fileReader = new FileReader("src//fileWrite.txt");
             FileWriter fileWriter = new FileWriter("b.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {

                System.out.print((char) c);
                fileWriter.write(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
