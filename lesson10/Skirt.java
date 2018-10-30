package com.company.lesson10;

public class Skirt extends Clothes implements WomanClothe  {
    public Skirt(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearWoman() {

    }
}
