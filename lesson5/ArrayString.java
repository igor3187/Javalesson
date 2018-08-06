package com.company.lesson5;

public class ArrayString {
    public static void main(String[] args) {
        char c = 'a';

        String[][] array = new String[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 6; i++) {
               array[i][j] = c + "" + (j + 1);
                System.out.print(array[i][j]);
            }
            c++;
        }
    }
}
