package com.company.lesson5.lesson5new;

public class DoubleArray {
    public static void main(String[] args) {
        String[][] s = new String[3][9];
        char c = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = c + " " + (j + 1);
                System.out.print(s[i][j]);
            }
            c++;
            System.out.println();
        }
    }
}
