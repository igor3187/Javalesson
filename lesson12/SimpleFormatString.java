package com.company.lesson12;

public class SimpleFormatString {
    public static void main(String[] args) {
        createString("Иванов", "математике.", 5);
        createString("Петров", "физике.", 4);
    }

    private static void createString(String fullName, String subject, int mark) {
        //  Formatter f = new Formatter();
        //  f.format("Студент %15s получил %3d по %-10s \n", fullName, mark, subject);
        // System.out.print(f);

        //System.out.format("Студент %15s получил %3d по %-10s \n", fullName, mark, subject);

        String str = String.format("Студент %15s получил %3d по %-10s \n", fullName, mark, subject);
        for (int i = 0; i < 10; i++)
        System.out.print(str);
    }
}
