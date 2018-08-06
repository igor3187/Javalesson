package com.company.lesson9;

public class Apricot extends Fruit {


    public static final int PRICE_PER_KG = 40;

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double coast() {
        return getWeight() * PRICE_PER_KG;
    }

}
