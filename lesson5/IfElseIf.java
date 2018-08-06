package com.company.lesson5;

public class IfElseIf {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i == 1) {
            System.out.println("Monday");
        } else if (i == 2) {
            System.out.println("Tuesday");
        } else if (i == 3) {
            System.out.println("Wednesday");
        } else if (i == 4) {
            System.out.println("Thursday");
        } else if (i == 5) {
            System.out.println("Friday");
        } else if (i == 6 || i == 7) {
            System.out.println("It's weekend!");

        }
    }
}
