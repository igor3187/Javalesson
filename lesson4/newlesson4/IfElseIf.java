package com.company.lesson4.newlesson4;

public class IfElseIf {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6 || day == 7) {
            System.out.println("it's weekend");
        } else {
            System.out.println("wrong number of day");
        }

       /* String day = args[0];

        if (day.equals("1")) {
            System.out.println("Monday");
        } else if (day.equals("2")) {
            System.out.println("Tuesday");
        } else if (day.equals("3")) {
            System.out.println("Wednesday");
        } else if (day.equals("4")) {
            System.out.println("Thursday");
        } else if (day.equals("5")) {
            System.out.println("Friday");
        } else if (day.equals("6") || day.equals("7")) {
            System.out.println("it's weekend");
        } else {
            System.out.println("wrong number of day");
        }*/
    }
}
