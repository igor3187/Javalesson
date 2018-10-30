package com.company.lesson12;

public class StartAndWith {
    public static void main(String[] args) {
        String s = new String("I like Java!!!");

        startWith(s);
        endWith(s);

    }

    public static void startWith(String s){
        boolean b = s.startsWith("!!!");
        System.out.println(b);
    }
    public static void endWith(String s){
        boolean c = s.endsWith("!!!");
        System.out.println(c);
    }
}
