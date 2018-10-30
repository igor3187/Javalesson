package com.company.lesson10;

public class Tie extends Clothes implements ManClothe{
    public Tie(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearMan() {

    }
}
