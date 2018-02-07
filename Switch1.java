package com.company;

public class Switch1 {
    public static void main(String[] args) {
        int r;
        r = Integer.parseInt(args[0]);
        switch (args[0]) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday")
                ;
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
            default:
                System.out.println("Wrong enter!! Please,enter number from 1 to 7 !");
        }
    }
}
