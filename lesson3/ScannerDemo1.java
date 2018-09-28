package com.company.lesson3;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите целое число:");

        if (s.hasNextInt()) {

            int i = s.nextInt();
            System.out.println(i * 2);

        } else System.out.println("Вы ввели не целое число");
    }
}
