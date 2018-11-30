package com.company.lesson16.collections;

import com.company.lesson16.HeavyBox1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox1> box1s = new ArrayList<>();
        box1s.add(new HeavyBox1(2, 3, 4, 5));
        box1s.add(new HeavyBox1(1, 7, 9, 3));
        box1s.add(new HeavyBox1(4, 7, 2, 9));
        box1s.add(new HeavyBox1(9, 9, 7, 7));
        box1s.add(new HeavyBox1(3, 3, 3, 3));
        box1s.add(new HeavyBox1(1, 1, 1, 1));

        box1s.get(0).weight = 4;
        box1s.get(0).height = 10;
        System.out.println(box1s.get(0));

        remove(box1s);

        System.out.println(box1s);
    }

    private static void remove(List<HeavyBox1> box1s) {
        box1s.remove(box1s.size() - 1);
        System.out.println(box1s.size());
    }

    private static void getList(List<HeavyBox1> box1s) {
        for (HeavyBox1 heavyBox1 : box1s) {
            System.out.println("heavy box: " + heavyBox1);
        }
    }

}
