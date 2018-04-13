package com.company.lesson16;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(300, 300, 300, 300));
        list.add(new HeavyBox1(400, 400, 400, 400));
        list.add(new HeavyBox1(100, 100, 100, 100));
        list.add(new HeavyBox1(500, 500, 500, 500));
        System.out.println(getBox(list));
    }


    private static List<HeavyBox1> getBox(List<HeavyBox1> list) {
        List<HeavyBox1> result = new ArrayList<>();
        Iterator<HeavyBox1> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox1 box1 = iterator.next();
            if (box1.getWeight() > 300) {
                result.add(box1);
                iterator.remove();
            }
        }
        return result;
    }
}
