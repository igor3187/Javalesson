package com.company.lesson14;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        /*Predicate<String> predicate = str -> str != null;
        Predicate<String> predicate1 = str -> !str.isEmpty();*/

        Predicate<String> predicate3 = str -> str.startsWith("J");
        Predicate<String> predicate4 = str -> str.startsWith("N");
        Predicate<String> predicate5 = str -> str.endsWith("A");

        Predicate<String> stringPredicate = predicate3.or(predicate4).and(predicate5);

        System.out.println(stringPredicate.test("JavA"));
        System.out.println(stringPredicate.test("Jav"));
        System.out.println(stringPredicate.test("Net"));
        System.out.println(stringPredicate.test("NetA"));

        /*System.out.println(predicate.and(predicate1).test(null));
        System.out.println(predicate.and(predicate1).test(""));
        System.out.println(predicate.and(predicate1).test("wer"));*/


    }
}
