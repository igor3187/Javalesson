package com.company.lesson11;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);

        switchSeason(Season.SUMMER);
        switchSeason(Season.WINTER);
        switchSeason(season);
        season.getDescription();

    }

    public static void switchSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love Autumn");
            default:
                System.out.println("Choice your season");
        }
    }
}
