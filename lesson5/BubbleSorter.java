package com.company.lesson5;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 9, 6, 3, 8, 7};

        int t;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    t = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        //  Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
