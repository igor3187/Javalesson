package com.company.lesson18;

import java.io.*;

public class WriterReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\io\\file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\io\\buffWriter.txt"))) {

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

