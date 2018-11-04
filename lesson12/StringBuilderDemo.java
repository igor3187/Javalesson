package com.company.lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        calculate(3, 56);
        calculate(15, 8);
        calculate(3, 4);

    }

    private static void calculate(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a);
        stringBuilder.append(" + ");
        stringBuilder.append(b).append(" = ").append(a + b);
        int pos = stringBuilder.indexOf("=");
        //stringBuilder.replace(pos,5,7,);
        stringBuilder.insert(pos,"равно").append("\n");


        stringBuilder.append(a);
        stringBuilder.append(" - ");
        stringBuilder.append(b).append(" = ").append(a - b).append("\n");


        stringBuilder.append(a);
        stringBuilder.append(" * ");
        stringBuilder.append(b).append(" = ").append(a * b);
        System.out.println(stringBuilder.toString());
        System.out.println();
    }
}
