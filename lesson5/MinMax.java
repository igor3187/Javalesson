package com.company.lesson5;

public class MinMax {
    public static void main(String[] args) {
        int[][] array = {{100, 25, 34, 65, 78, 22, 12, 55},
                {54, 87, 77, 55, 45, 34, 23, 11},
                {12, 23, 34, 45, 5, 67, 78, 89},
                {9, 98, 87, 65, 43, 32, 21, 33},
                {12, 23, 34, 45, 56, 67, 78, 99}};

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
            System.out.println(min);
        }
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 1; j > array[i].length; j++) {
                if (max > array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println(max);
        }
    }
}