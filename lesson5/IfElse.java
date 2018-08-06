package com.company.lesson5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введтте целое число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i > 0 && i < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше,равно 10 или число отрицательное.");
        }
    }
}

