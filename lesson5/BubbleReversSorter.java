package com.company.lesson5;

import java.util.Arrays;
import java.util.Collections;

public class BubbleReversSorter {
    public static void main(String[] args) {

        Integer[] sorter = {4, 7, 9, 2, 5, 3, 1, 8, 6};

      /*  int f;

        for (int i = 0; i < sorter.length; i++) {
            for (int j = sorter.length - 1; j > i; j--) {
                if (sorter[j - 1] > sorter[j]) {
                    f = sorter[j - 1];
                    sorter[j - 1] = sorter[j];
                    sorter[j] = f;
                }
            }
        }*/
        Arrays.sort(sorter, Collections.reverseOrder());
        System.out.println(Arrays.toString(sorter));
    }
}

