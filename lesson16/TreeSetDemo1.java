package com.company.lesson16;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        SortedSet<HeavyBox1> set = new TreeSet<>();

        set.add(new HeavyBox1());
        set.add(new HeavyBox1(2,2,2,2));
        set.add(new HeavyBox1(3,3,3,3));
        set.add(new HeavyBox1(1,1,1,1));


        set.forEach(System.out::println);

    }
}
