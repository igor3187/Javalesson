package com.company.lesson4;

import java.util.Scanner;

public class ScannIn {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.println("Введите целое число от 0 до 10");

        int x;

        x = c.nextInt();

        printNum(x);

    }

    private static void printNum(int x) {

        if (x > 0 && x < 10) {

            System.out.println("Положительное число меньше 10");

        } else {
            System.out.println("Число больше 10, не целое или отрицательное");
        }
    }
}
