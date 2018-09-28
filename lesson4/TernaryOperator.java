package com.company.lesson4;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Введите любое чило");

        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {
            int i = s.nextInt();
            System.out.println("Ведите второе число");
        }
        if (s.hasNextInt()) {

            int e = s.nextInt();
            System.out.println("Ведите третье число");
        }
        if (s.hasNextInt()){
            int r = s.nextInt();

        }

    }

}
