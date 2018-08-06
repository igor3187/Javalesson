package com.company.lesson9;

public class Pear extends Fruit {

    public static final int PRICE_PER_KG = 20;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double coast() {
        return getWeight() * PRICE_PER_KG;
    }

}
