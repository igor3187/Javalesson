package com.company.lesson12;

import java.util.Formatter;


public class FormatterDemo {
    public static void main(String[] args) {


        formatterDemo("Иванов", '8', "Предмет");

    }

    private static void formatterDemo(String fullName, char mark, String subject) {
        Formatter f = new Formatter();
        f.format("Студент %15s получил %3c по %10s ", fullName, mark, subject);

        System.out.println(f);
    }

}
