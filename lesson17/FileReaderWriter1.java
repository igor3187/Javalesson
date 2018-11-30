package com.company.lesson17;

import java.io.*;

public class FileReaderWriter1 {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("a.txt"); Writer writer = new FileWriter("b.txt")) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                writer.write(symbol);
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
