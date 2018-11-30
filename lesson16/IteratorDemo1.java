package com.company.lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();

        list.add(new HeavyBox1(3, 2, 2, 200));
        list.add(new HeavyBox1(5, 2, 2, 500));
        list.add(new HeavyBox1(4, 2, 2, 400));
        list.add(new HeavyBox1(2, 2, 2, 300));

        List<HeavyBox1> heavyBox1s = sortList(list);

        System.out.println(list);
        System.out.println(heavyBox1s);
    }

    private static List<HeavyBox1> sortList(List<HeavyBox1> list) {
        List<HeavyBox1> result = new ArrayList<>();
        Iterator<HeavyBox1> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox1 box1 = iterator.next();
            if (box1.weight > 300) {
                result.add(box1);
                iterator.remove();
            }
        }
        return result;
    }
}
