package com.company.lesson12;

public class FindSubString {


    public static void main(String[] args) {
        String s = "I Like Java Java!!!";

        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        subString("I Like Java Java!!!", "Java");

    }

    private static void subString(String s, String subSt) {
        int pos = s.indexOf(subSt);
        System.out.println(s.substring(pos, pos + subSt.length()));
    }
}
