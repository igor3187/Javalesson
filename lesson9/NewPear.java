package com.company.lesson9;

public class NewPear extends NewFruit {

    public static final int PRICE_PER_KG = (int) 5.0;

    public NewPear(double weight) {
        super(weight);
    }

    @Override
    double fruitPrice() {
        return getWeight() * PRICE_PER_KG;
    }
}
