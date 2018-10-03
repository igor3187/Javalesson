package com.company.lesson3;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);
        System.out.println("Enter integer number:");

        if (vol.hasNextInt()) {
            int i = vol.nextInt();
            int c = i % 2;
            if (c == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}