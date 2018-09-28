package com.company.lesson2;

public class MethodCalc {
    public static void main(String[] args) {

        int i = 6;

        int b = 4;

        int c;

        c = calc(i, b);

        System.out.println(c);
    }

    static int calc(int i, int b) {
        return i + b;
    }

}
