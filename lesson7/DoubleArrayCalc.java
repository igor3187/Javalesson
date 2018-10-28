package com.company.lesson7;

import java.util.Arrays;

public class DoubleArrayCalc {
    private int[][] array;
    private int row, col;

    public DoubleArrayCalc(int[][] array) {
        this.array = array;
        this.row = array.length;
        this.col = array[0].length;
    }


    public static void main(String[] args) {


        int[][] matrix1 = new int[][]{{2, 3, 7, 8}, {3, 1, 5, 9}};
        int[][] matrix2 = new int[][]{{4, 1, 9, 5}, {5, 7, 4, 8}};

        DoubleArrayCalc m1 = new DoubleArrayCalc(matrix1);
        DoubleArrayCalc m2 = new DoubleArrayCalc(matrix2);
        DoubleArrayCalc m3 =m1.getAddition(m2);
        m3.print();
        m3.getMultiplication(m1);
        System.out.println(Arrays.deepToString(m1.getMultiplication(m2)));
    }

    private DoubleArrayCalc getAddition(DoubleArrayCalc o) {
        if (o.row!= row || o.col!= col){
            return null;
        }
        int[][] sum = new int[row][col];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[0].length; j++) {
                sum[i][j] = array[i][j] + o.array[i][j];
            }
        }
        DoubleArrayCalc result =new DoubleArrayCalc(sum);
        return result;
    }

    private int[][] getMultiplication(DoubleArrayCalc o) {
        int[][] sum = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum[i][j] = array[i][j] * o.array[i][j];
            }
        }
        return sum;
    }
    private void print(){
        System.out.println(  Arrays.deepToString(array));
    }
}
