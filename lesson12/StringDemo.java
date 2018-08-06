package com.company.lesson12;

public class StringDemo {
    public static void main(String[] args) {


        getString("I like java!!!");
        getString("I like.net");

        getChar("True");

        String str = "I like Java";
        int pos = str.indexOf("Java");

        System.out.println("index of(Java)= " + str.indexOf('J'));

        System.out.println("Java".replace('a', 'o'));

        System.out.println(str.substring(pos));

    }

    public static void getString(String s) {
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like java"));
    }

    public static void getChar(String c) {
        int len = c.length();
        len = len - 1;
        System.out.println(c.charAt(len));
    }
}
