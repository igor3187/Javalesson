package com.company.lesson4;

import java.util.Scanner;

public class MyGarland {

    public static void main(String[] args) {

        int i = 32;

        int b = blink(~i);

        int c = run(i);

        int d = getMask(i);

        System.out.println("Выберите режим: 1 - 4 ");

        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {

            int k = s.nextInt();

            switch (k) {
                case 1:
                    System.out.println("Лампа включена " + Integer.toBinaryString(i));
                    break;
                case 2:
                    System.out.println("Лампа мигнула " + Integer.toBinaryString(b));
                    break;
                case 3:
                    System.out.println("Режим бегущей строки " + Integer.toBinaryString(c));
                    break;
                case 4:
                    System.out.println("Режим маски " + Integer.toBinaryString(d));
            }

        }

    }

    private static int getMask(int i) {
        return i & 2;
    }

    private static int run(int i) {
        return i << 2;
    }

    private static int blink(int i2) {
        return i2;
    }

}
