package com.company.lesson10;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        print(season);
        print(Season.SUMMER);
        print1();
        print2();

    }
    public static void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("Love Winter");
                break;

            case SPRING:
                System.out.println("Love Spring");
                break;

            case SUMMER:
                System.out.println("Love Summer");
                break;

            case AUTUMN:
                System.out.println("Love Autumn");
                break;
        }
    }

    public static void print1(){
        Season[] values = Season.values();
        for (Season s : values){
            System.out.println(s + " " + s.getAvgTemperature());
            System.out.println(s + " " + s.getDescription());
        }
    }
    public static void print2(){
        Season myFavSeason = Season.valueOf("AUTUMN");
        System.out.println(myFavSeason);

    }
}