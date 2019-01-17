package com.company.lesson10;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        Season season1 = Season.SPRING;
        System.out.println(season);
        System.out.println(season1);

        printSeason(Season.SUMMER);
        printAllSeasons();
        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);

    }



    public static void printAllSeasons() {
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s.ordinal());
            System.out.println(s + " overage temp: " + s.getTemp() + " " + s.getDescription());
        }
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Love Winter!");
                break;
            case SPRING:
                System.out.println("Love Spring!");
                break;
            case SUMMER:
                System.out.println("Love Summer!");
                break;
            case AUTUMN:
                System.out.println("Love Autumn!");
        }
    }
}
