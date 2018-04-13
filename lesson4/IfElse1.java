package com.company.lesson4;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter number : ");
        x = scan.nextInt();
        if (x <= 10) {
            System.out.println("Number is less then 10 or equal to.");
        } else {
            System.out.println("Number is greater than 10 or it's negative.");

        }
    }
}
