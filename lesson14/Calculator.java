package com.company.lesson14;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(4, 4));
        System.out.println(subtraction(4, 4));
        System.out.println(multiply(4, 4));
        System.out.println(divide(4, 4));

    }

    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T t, V v) {
        return t.doubleValue() - v.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return t.doubleValue() * v.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        return t.doubleValue() / v.doubleValue();
    }
}
