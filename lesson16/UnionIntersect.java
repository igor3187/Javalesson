package com.company.lesson16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 5, 6, 7, 8, 9));

        System.out.println(getUnion(set1, set2));
        System.out.println(getIntersect(set1, set2));
    }

    private static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        return union;
    }

    private static Set<Integer> getIntersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);

        return intersect;
    }
}
