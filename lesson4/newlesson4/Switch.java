package com.company.lesson4.newlesson4;

public class Switch {
    public static void main(String[] args) {
        String day = args[0];

        switch (day) {
            case "1": {
                System.out.println("Monday");
                break;
            }
            case "2": {
                System.out.println("Tuesday");
                break;
            }
            case "3": {
                System.out.println("Wednesday");
                break;
            }
            case "4": {
                System.out.println("Thursday");
                break;
            }
            case "5": {
                System.out.println("Friday");
                break;
            }
            case "6":
            case "7": {
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.println("Wrong number of the week");
        }
    }
}
