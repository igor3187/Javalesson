package com.company.lesson2;

public class Literal {

    public static void main(String[] args) {

        boolean b = true;

        String s = "Java";

        char a = 'R';

        float f = 897.43f;

        double d = 12.5;

        byte i = 0b01; // двоичный литерал

        short sh = 0167; // восьмиричный литерал

        int r = 895; // десятиричный литерал

        long l = 0x09af; // шестнадцатиричный литерал


        System.out.println("boolean - " + b);
        System.out.println("String - " + s);
        System.out.println("char - " + a);
        System.out.println("float - " + f+"f");
        System.out.println("double - " + d);
        System.out.println("2 literal - " + i);
        System.out.println("8 literal - " + sh);
        System.out.println("10 literal - " + r);
        System.out.println("16 literal - " + l);


    }
}
