package com.company.lesson15;

import java.util.function.Predicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s != null;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("dsaf"));
        System.out.println(predicate.test(null));

        Predicate<String> predicate1 = s -> !s.isEmpty();
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("sdf"));
    }
}
