package com.company.lesson5;

public class Array {
    public static void main(String[] args) {
        int[][] array = {{4, 2, 3, 4, 5, 1, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40}};
for(int[] a:array ) {
    System.out.println(min(a));
}

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }

        }
        return min;
    }

}