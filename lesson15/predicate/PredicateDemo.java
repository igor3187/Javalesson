package com.company.lesson15.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s != null;
        Predicate<String> predicate1 = s -> !s.isEmpty();
        System.out.println(predicate.test(null));
        System.out.println(predicate.test("sss"));
        System.out.println(predicate.test(null));

        System.out.println(predicate1.test("srt"));
        System.out.println(predicate1.test(null));
    }
}
