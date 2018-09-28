package com.company.lesson3;

import java.util.Scanner;

public class ScannerDemo2 {

    static int i,x;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите целое число: ");

        if (sc.hasNextInt()) {
            i = sc.nextInt();
        } else System.out.println("вы ввели не целое число");


        System.out.println("введите второе целое число: ");

        if (sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println(i + x);
        } else
            System.out.println("вы ыыели не целое число");

    }

}
