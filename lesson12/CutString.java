package com.company.lesson12;

public class CutString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("string");
        StringBuilder sb1 = new StringBuilder("code");
        StringBuilder sb2 = new StringBuilder("practice");

        System.out.println(sb.replace(0, 6, "ri"));
        System.out.println(sb1.replace(0, 4, "od"));
        System.out.println(sb.replace(0, 9, "ct"));

    }
}
