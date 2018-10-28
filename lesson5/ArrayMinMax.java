package com.company.lesson5;

import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 6, 4};

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println(Arrays.toString(arr));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
