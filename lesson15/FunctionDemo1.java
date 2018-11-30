package com.company.lesson15;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Integer, String> function = (Integer i) -> {
            if (i > 0) {
                return ("Положительное число");
            } else if (i < 0) {
                return ("отрицательное число");
            } else {
                return "ноль";
            }
        };
        System.out.println(function.apply(9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(-6));
    }
}
