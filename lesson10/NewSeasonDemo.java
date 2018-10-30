package com.company.lesson10;

public class NewSeasonDemo {
    public static void main(String[] args) {
        NewSeason newSeason = NewSeason.SUMMER;
        NewSeason newSeason1 = NewSeason.valueOf("AUTUMN");
        System.out.println(newSeason1);
        System.out.println(newSeason);
        printSeason(NewSeason.WINTER);

        printAllSeason();

    }

    private static void printAllSeason() {
        NewSeason[] seasons = NewSeason.values();
        for (NewSeason s : seasons) {
            System.out.println(s.getInfo() + " " + s.getDescription());
        }
    }

    public static void printSeason(NewSeason newSeason) {
        switch (newSeason) {
            case WINTER:
                System.out.println("Love winter");
                break;
            case SPRING:
                System.out.println("Love spring");
                break;
            case SUMMER:
                System.out.println("Love summer");
                break;
            case AUTUMN:
                System.out.println("Love autumn");
        }
    }
}
