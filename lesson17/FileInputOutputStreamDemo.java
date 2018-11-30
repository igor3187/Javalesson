package com.company.lesson17;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\a.txt"); InputStream input = new FileInputStream("src\\a.txt")) {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла

            for (char a : c) {
                // Запись каждого символа в текстовый файл
                output.write(a);
            }

            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
