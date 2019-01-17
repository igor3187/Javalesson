package com.company.lesson12.newLesson12;

public class FormatterDemo {
    public static void main(String[] args) {

        getFormat("Petrov", 5, "math");
        getFormat("Petrov", 5, "math");

    }

    private static void getFormat(String name, int marc, String subject) {
        //Formatter f = new Formatter();
        //f.format("Student %15s has %2d on %10s", name, marc, subject);
        System.out.printf("Student %15s has %2d on %10s%n", name, marc, subject);
    }
}
