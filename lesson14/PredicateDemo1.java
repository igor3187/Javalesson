package com.company.lesson14;

import com.company.lesson16.HeavyBox1;

import java.util.function.Consumer;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Consumer<HeavyBox1> consumer = box -> System.out.println(" Отгрузили ящик с весом n" + box.weight);

        consumer.accept(new HeavyBox1(1, 1, 1, 1));
    }
}
