package com.company.lesson5;

import java.util.Arrays;

public class BubbleSorter2 {
    public static void main(String[] args) {

        int[] massive = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));
    }
}
