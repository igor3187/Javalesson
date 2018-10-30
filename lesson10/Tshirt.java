package com.company.lesson10;

public class Tshirt extends Clothes implements ManClothe, WomanClothe{

    public Tshirt(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearMan() {

    }

    @Override
    public void toWearWoman() {

    }
}
