package com.company.lesson4.newlesson4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 0 to 10");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            getNum(x);
        }
    }

    private static void getNum(int x) {
        if (x > 10) {
            System.out.println("you'v enter wrong number");
        } else {
            System.out.println("You number is: " + x);
        }
    }
}
