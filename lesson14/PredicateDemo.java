package com.company.lesson14;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String s = null;
        Predicate<String> predicate = str -> str != null;
        System.out.println(predicate.test("jkjd"));
        System.out.println(predicate.test(s));
        System.out.println();
    }
}
