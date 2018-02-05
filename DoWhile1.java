package com.company;

public class DoWhile1 {
    public static void main(String[] args) {
        int t = 1;

        do {
            if (t % 5 == 0) {
                System.out.println(t);
            }
        } while (t++ <= 100);

    }
}
