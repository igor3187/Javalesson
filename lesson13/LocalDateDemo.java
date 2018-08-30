package com.company.lesson13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1987, 01, 31);
        LocalDate toDay = LocalDate.now();
        System.out.println(birthDay);

        int year = birthDay.getYear();
        Month month = birthDay.getMonth();
        int dayOfMonth = birthDay.getDayOfMonth();
        int dayOfYear = birthDay.getDayOfYear();
        DayOfWeek dayOfWeek = birthDay.getDayOfWeek();
        boolean currentTime = birthDay.isBefore(toDay);
        boolean currentTimeAfter = birthDay.isAfter(toDay);

        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);
        System.out.println(currentTime);
        System.out.println(currentTimeAfter);
    }
}
