package com.company.lesson4;

import java.util.Scanner;

public class MyGarland {
    public static void main(String[] args) {
        System.out.println("Приложение гирлянда.");
        int i = 32;

        Scanner s = new Scanner(System.in);
        garlandMode(i, s);
    }

    private static void garlandMode(int i, Scanner s) {

        System.out.println("Выберите режим гирлянды: 1 - Мигнуть лампочками. 2 - Режим бегущей строки. 3 - Режим маски. 4 - Текущее состояние гирлянды. ");

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
                    show(i);
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

    private static void show(int i) {
        if (i == 1) {
            System.out.println("Лампа включена: ");
        }else {
            System.out.println("Лампа выключена: ");
        }
    }

    private static void run(int a) {
        System.out.println("Бегущая строка ");
        for (int i = 0; i < 10; i++) {
            i = i << 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }

    private static void blink(int a) {
        System.out.println("Лампа мигнула ");
        for (int i = 0; i < 10; i++) {
            i = ~i;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
