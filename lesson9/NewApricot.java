package com.company.lesson9;

public class NewApricot extends NewFruit {

    public static final int PRICE_PER_KG =  6;

    public NewApricot(double weight) {
        super(weight);
    }

    @Override
    double fruitPrice() {
        return getWeight() * PRICE_PER_KG;
    }
}
