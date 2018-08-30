package com.company.lesson15;

import com.company.lesson16.HeavyBox1;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox1> consumer1 = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
        Consumer<HeavyBox1> consumer2 = box -> System.out.println("Отпровляем ящик " + box.weight);

        consumer1.andThen(consumer2).accept(new HeavyBox1(1, 1, 1, 1));
    }
}
