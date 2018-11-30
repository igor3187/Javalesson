package com.company.lesson15;

import com.company.lesson16.HeavyBox1;

import java.util.function.Consumer;

public class ConsumerHeavyBox {
    public static void main(String[] args) {
        Consumer<HeavyBox1> consumer = box1 -> System.out.println("отгрузили ящик с весом: " + box1.weight);
        Consumer<HeavyBox1> consumer1 = box1 -> System.out.println("отгрузили ящик с весом: " + box1.weight);

        consumer.andThen(consumer1).accept(new HeavyBox1(2,2,2,2));
    }

}
