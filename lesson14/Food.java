package com.company.lesson14;

import java.util.function.Consumer;

public class Food {
    public void prepare(Consumer<String> c) {
        c.accept("str");
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(System.out::println);
        //Cookable cookable = () -> System.out.println("Жарим картошку");

       /* Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Жарим картошку");
            }
        };*/
    }
}
