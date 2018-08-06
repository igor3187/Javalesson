package com.company.lesson12;

public class StringBuilderAppend {
    public static void main(String[] args) {
        print(3, 56);
    }

    public static void print(int x, int y) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x).append(" + ").append(y);
        stringBuilder.append(" = ").append(x + y).append("\n");

        stringBuilder.append(x).append(" - ").append(y);
        stringBuilder.append(" = ").append(x - y).append("\n");

        stringBuilder.append(x).append(" * ").append(y);
        stringBuilder.append(" = ").append(x * y);

        System.out.println(stringBuilder);

        replace(stringBuilder, "+", "плюс");
    }

    private static void replace(StringBuilder stringBuilder, String substring, String newString) {
        int pos;

        while ((pos = stringBuilder.indexOf(substring)) != -1) {

            //stringBuilder.deleteCharAt(pos);
            //stringBuilder.insert(pos, newString);

            stringBuilder.replace(pos, pos + substring.length(), newString);

        }
        System.out.println(stringBuilder);
    }

}
