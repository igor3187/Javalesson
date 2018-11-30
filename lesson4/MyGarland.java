package com.company.lesson4;

import java.util.Scanner;

public class MyGarland {
    public static void main(String[] args) {
        System.out.println("Приложение герлянда.");
        int i = 32;

        Scanner s = new Scanner(System.in);
        garlandMode(i, s);
        if (s.hasNextInt()) {
            s.nextInt();
        }
    }

    private static void garlandMode(int i, Scanner s) {

        System.out.println("Выберите режим герлянды: 1 - Мигнуть лампочками. 2 - Режим бегущей строки. 3 - Режим маски. 4 - Текущее состояние герлянды. ");

        if (s.hasNextInt()) {
            int k = s.nextInt();

            switch (k) {
                case 1:
                    blink(i);
                    break;
                case 2:
                    run(i);
                    break;
                case 3:
                    getMask(i);
                    break;
                case 4:
                    System.out.println("Лампа включена " + Integer.toBinaryString(i));
                default:
                    if (k > 4) {
                        System.out.println("Не верный режим! Выберите режим от 1 до 4:");
                        garlandMode(i, s);
                    } else {
                        System.exit(0);
                    }
            }
        }
    }

    private static void getMask(int i) {
        System.out.println("Режим маски " + Integer.toBinaryString(i));
    }

    private static void run(int i) {
        System.out.println("Бегущая строка ");
        for (int j = 0; j < 10; j++) {
            i = i << 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }

    private static void blink(int i) {
        System.out.println("Лампа мигнула ");
        for (int j = 0; j < 10; j++) {
            i = ~i;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
