package com.company.lesson12.newLesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = stringBuilder(3, 56);
        System.out.println(str);

        //System.out.println(stringBuilder(3, 56));
        System.out.println(replaceSymbol(str, "=", " ravno "));
        System.out.println(replaceSymbol(str, "=", "plus"));
    }

    private static StringBuilder stringBuilder(int a, int b) {
        StringBuilder s = new StringBuilder(100);
        s.append(a).append("+").append(b).append("=").append(a + b).append("\n");
        s.append(a).append("-").append(b).append("=").append(a - b).append("\n");
        s.append(a).append("*").append(b).append("=").append(a * b).append("\n");
        s.append(a).append("*").append(b).append("=").append(a * b).append("\n");
        return s;
    }

    private static StringBuilder replaceSymbol(StringBuilder stringBuilder, String replaceSymbol, String replaceWith) {
        int pos;
        while ((pos = stringBuilder.indexOf(replaceSymbol)) != -1) {
            //stringBuilder.delete(pos, pos + replaceSymbol.length());
            //stringBuilder.insert(pos, replaceWith);
            stringBuilder.replace(pos, pos + replaceSymbol.length(),replaceWith);
        }
        return stringBuilder;
    }
}
