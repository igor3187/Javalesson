package com.company.lesson12;

public class FindChar {
    public static void main(String[] args) {
        String s = "Find last char";
        findChar(s);
    }

    private static void findChar(String s) {
        int l = s.length();
        System.out.println(s.charAt(l - 1));
    }
}
