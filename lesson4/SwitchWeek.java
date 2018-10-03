package com.company.lesson4;

public class SwitchWeek {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("Пн");
                break;
            case "2":
                System.out.println("Вт");
                break;
            case "3":
                System.out.println("Ср");
                break;
            case "4":
                System.out.println("Чт");
                break;
            case "5":
                System.out.println("Чт");
                break;
            case "6":
                System.out.println("Чт");
                break;
            case "7":
                System.out.println("Чт");
                break;
                default:
                    System.out.println("Число введено не верно");
        }
    }
}
