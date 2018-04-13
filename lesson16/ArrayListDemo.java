package com.company.lesson16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1());
        list.add(new HeavyBox1(2, 2, 2, 2));
        list.add(new HeavyBox1(3, 3, 3, 3));
        HeavyBox1 heavyBox1 = new HeavyBox1(1, 1, 1, 1);
        list.add(heavyBox1);

        System.out.println("Размер: " + list.size());
        for (HeavyBox1 box : list) {
            System.out.println("Элемент: " + box);
        }
        HeavyBox1 firstBox = list.get(0);
        firstBox.weight += 1;

        list.set(0, firstBox);

        list.remove(list.size() - 1);

        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}