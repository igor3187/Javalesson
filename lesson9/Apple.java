package com.company.lesson9;

public class Apple extends Fruit {

    public static final int PRICE_PER_KG = 30;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double coast() {
        return getWeight() * PRICE_PER_KG;
    }

}
