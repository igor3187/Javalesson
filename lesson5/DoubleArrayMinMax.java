package com.company.lesson5;

import java.util.Arrays;

public class DoubleArrayMinMax {
    public static void main(String[] args) {

        int[][] msv = {{3, 12, 1, 6, 43, 87, 22, 24}, {21, 88, 4, 14, 7, 59, 90, 2}, {5, 6, 77, 12, 33, 11, 7, 14}, {43, 3, 93, 1, 32, 56, 8, 12}, {77, 7, 65, 5, 21, 3, 10, 81}};

        int[][] minMax = new int[5][2];


        for (int i = 0; i < msv.length; i++) {
            int min = msv[i][0];
            int max = msv[i][0];
            for (int j = 0; j < msv[i].length; j++) {
                if (min < msv[i][j]) {
                    min = msv[i][j];
                }
                if (max > msv[i][j]) {
                    max = msv[i][j];
                }
                /*for (int i1 = 0; i1 < minMax.length; i1++){
                    for (int j1 = 0; j1 < minMax[i1].length; j1++);
                }*/
                //System.arraycopy(msv, 0, minMax, 0, 2);
                for (int i1 = 0; i1 < minMax.length; i1++) {
                   // System.out.println(minMax[i1] + " ");
                }

            }
            minMax[i][0] = min;
            minMax[i][1] = max;


            //Arrays.sort(msv);

            // int min = msv[0][0];
            //int max = msv[msv.length - 1][msv.length - 1];
            //System.out.println(min);
            //System.out.println(max);
            System.out.println(Arrays.deepToString(msv));
            System.out.println(Arrays.deepToString(minMax));


        }
    }
}