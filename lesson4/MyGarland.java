package com.company.lesson4;

import java.util.Scanner;

public class MyGarland {

    public static void main(String[] args) {

        int i = 32;

        System.out.println("Выберите количество итераций ");
        Scanner s = new Scanner(System.in);

        getKol(s);

        garlandMode(i, s);
    }

    private static void getKol(Scanner s) {
        if (s.hasNextInt()) {
            s.nextInt();
        }
    }

    private static void garlandMode(int i, Scanner s) {

        System.out.println("Выберите режим: 1 - 4 ");

        if (s.hasNextInt()) {

            int k = s.nextInt();

            switch (k) {
                case 1:
                    System.out.println("Лампа включена " + Integer.toBinaryString(i));
                    break;
                case 2:
                    blink(i);//лампа мигнула
                    break;
                case 3:
                    run(i);//бегущая строка
                    break;
                case 4:
                    getMask(i & 2);
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
