package com.company.lesson11;

public class SeasonDemo1 {
    public static void main(String[] args) {
        Season seasons[] = Season.values();
        for (Season s : seasons) {
            System.out.println(s);
            s.getDescription();
            s.getTemp();
        }

        Season season = Season.valueOf("SPRING");
        System.out.println(season);

        System.out.println(season.getTemp());

    }
}
