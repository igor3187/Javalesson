package com.company.lesson12;

public class NewFormatter {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        int a = 3;
        int b = 56;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb = new StringBuilder("I like Java!!");

        sb.setCharAt(8, 'o');
        sb.setCharAt(10, 'o');

        System.out.println(s.charAt(13));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(sb);
        System.out.println(sb.toString().toUpperCase());
        System.out.println(sb.toString().toLowerCase());
        System.out.println(sb.substring(7,11));
        System.out.println(sb1.append(a).append("+").append(b).append("равно").append(59));
        System.out.println(sb2.append(a).append("-").append(b).append("=").append(-53));
        System.out.println(sb3.append(a).append("*").append(b).append("=").append(168));
    }
}
