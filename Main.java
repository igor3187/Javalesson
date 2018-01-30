package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int i, k;

        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i % 2 == 0) System.out.println("Число четное");
            else System.out.println("Не четное число");

            System.out.println("Введите второе целое число: ");
            if (sc.hasNextInt()) {
                k = sc.nextInt();
                if (k % 2 == 0) System.out.println("Число четное");
                else System.out.println("Не четное число");
                System.out.println("Сумма двух целых чисел: " + (i + k));
            }
        } else
            System.out.println("Не целое число!!");


    }
}

