package com.company.lesson5;

public class ArraySrtingD {

    public static void main(String[] args) {

        char symbol = 'a';

        String str[][] = new String[5][6];

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                str[i][j] = symbol + " " + (j + 1);

                System.out.print(str[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}