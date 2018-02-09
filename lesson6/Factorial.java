package com.company.lesson6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        int factorial = 1;
        int tempNum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            tempNum = num;
            while (num > 0) {
                factorial = factorial * num;
                num--;
            }
            System.out.println("------Output-------");
            System.out.println(tempNum + "! " + factorial);
        }else {System.out.println("Enter correct number!");
    }
    }
}
