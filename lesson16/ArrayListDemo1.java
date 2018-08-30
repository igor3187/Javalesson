package com.company.lesson16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<HeavyBox1> List1 = new ArrayList<>();
        List1.add(new HeavyBox1());
        List1.add(new HeavyBox1(2, 2, 2, 2));
        List1.add(new HeavyBox1(3, 3, 3, 3));

        HeavyBox1 heavyBox1 = new HeavyBox1(1, 1, 1, 1);
        List1.add(heavyBox1);
        List1.forEach(System.out::println);

        heavyBox1.weight += 1;
        //List1.remove(List1.size() - 1);

        System.out.println("размер " + List1.size());

    }
}