package com.company.lesson15;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

       // Supplier<Double> supplier = () -> Math.random() * 10;
       // System.out.println(supplier.get());
        IntFunction<String> function =  String::valueOf;
        System.out.println(function.apply(450));


        Supplier<String> newString = String::new;
        System.out.println(newString.get());

    }
}
