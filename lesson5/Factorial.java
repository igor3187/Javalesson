package com.company.lesson5;

public class Factorial {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 5);
        System.out.println(n);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
