package com.company.lesson7;

public class TwoDemArray {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        char c = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = c + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            c++;
            System.out.println();
        }
    }
}