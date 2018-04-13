package com.company.lesson13;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class Time {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1987,0,31);
        System.out.println(calendar.get(DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.getTimeInMillis());

    }
}
