package com.company.lesson4;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = 0, e = 0, r = 0;
        int x;

        System.out.println("Введите любое чило:");

        if (s.hasNextInt()) {
            i = s.nextInt();
            System.out.println("Ведите второе число:");
        }
        if (s.hasNextInt()) {

            e = s.nextInt();
            System.out.println("Ведите третье число:");
        }
        if (s.hasNextInt()) {
            r = s.nextInt();

        }
        x = i < e && i < r ? i : e < i && e < r ? e : r < i && r < e ? r : r;

        System.out.println("Меньшее из трех введенных чисел: " + x);
    }

}
