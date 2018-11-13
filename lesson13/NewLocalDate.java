package com.company.lesson13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NewLocalDate {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1987, 1, 31);
        LocalDate today = LocalDate.now();

        int dayYear = birthDay.getDayOfYear();

        DayOfWeek dayOfWeek = birthDay.getDayOfWeek();

        System.out.println(birthDay.isAfter(today));
        System.out.println(birthDay.isBefore(today));
        System.out.println(birthDay.isLeapYear());
        System.out.println(today.isLeapYear());
        System.out.println(birthDay);
        System.out.println(dayYear);
        System.out.println(dayOfWeek);


    }
}

