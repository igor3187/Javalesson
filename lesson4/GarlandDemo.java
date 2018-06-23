package com.company.lesson4;

import java.util.Scanner;

public class GarlandDemo {
    public static void main(String[] args) {

        int garland = 78;

        Scanner s = new Scanner(System.in);

        int kol = getKol(s);

        setMode(s, garland, kol);
    }

    private static int getKol(Scanner s) {
        System.out.println("Enter number of iteration : ");
        int kol = 10;
        if (s.hasNextInt()) {
            kol = s.nextInt();
        }
        return kol;
    }

    private static void setMode(Scanner s, int garland, int kol) {
        System.out.println("Enter set number of garland");

        if (s.hasNextInt()) {
            int mode = s.nextInt();

            switch (mode) {
                case 1:
                    run(garland, kol);
                    break;
                case 2:
                    blink(garland, kol);
                    break;
                case 3:
                    currentState(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    private static void run(int kol, int g) {
        for (int i = 0; i < kol; i++) ;
        g = g << 1;
        currentState(g);

    }

    private static void blink(int kol, int g) {
        for (int i = 0; i < kol; i++) ;
        g = ~g;
        currentState(g);
    }

    private static void currentState(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }
}


