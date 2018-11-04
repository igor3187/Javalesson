package com.company.lesson12;

public class Replace {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        replace(stringBuilder);
    }

    private static void replace(StringBuilder stringBuilder) {
        String str = "Object oriented programming";
        System.out.println("Before replace: " + str);
        stringBuilder.replace(0,str.length(), "OOP ");
        System.out.println("After replace: " + stringBuilder);
    }
}
