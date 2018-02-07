package com.company;

import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        int garland = 78;
        Scanner scanner = new Scanner(System.in);
        int kol = getKol(scanner);
        chooseMode(garland, scanner, kol);
    }

    private static int getKol(Scanner scanner) {
        System.out.println("Введите количество итераций");
        int kol = 10;
        if (scanner.hasNextInt()) {
            kol = scanner.nextInt();
        }
        return kol;
    }

    private static void chooseMode(int garland, Scanner scanner, int kol) {
        System.out.println("Enter number from 1 to 4");
        if (scanner.hasNextInt()) {
            int mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    blinc(garland, kol);
                    break;
                case 2:
                    runString(garland, kol);
                    break;
                case 3:
                    currentState(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }


    private static void blinc(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = ~g;
            currentState(g);
        }
    }

    static void runString(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = g << 1;
            currentState(g);
        }
    }

    private static void currentState(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }
}
