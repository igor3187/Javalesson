package com.company.lesson9;

public class NewApple extends NewFruit {

    public static final int PRICE_PER_KG = (int) 3.0;

    public NewApple(double weight) {
        super(weight);
    }

    @Override
    double fruitPrice() {
        return getWeight() * PRICE_PER_KG;
    }
}
