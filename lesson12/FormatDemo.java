package com.company.lesson12;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {

        print("Ivanov", 5, "Math");

        /*f.format("Student %s have an %d in subject %s", "Sidorov", 5, "math");
        System.out.println(f);*/
    }

    private static void print(String name, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Student %s have an %d in subject %s", name, mark, subject);
        System.out.println(formatter);
    }
}
