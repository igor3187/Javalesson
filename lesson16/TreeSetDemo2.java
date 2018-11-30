package com.company.lesson16;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        SortedSet<HeavyBox1> s = new TreeSet<>();

        s.add(new HeavyBox1());
        s.add(new HeavyBox1(2, 2, 2, 2));
        s.add(new HeavyBox1(1, 1, 1, 1));
        s.add(new HeavyBox1(3, 3, 3, 3));

        System.out.println(s);
    }
}