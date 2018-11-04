package com.company.lesson10.Clothes;

public class Tie extends Clothes implements ManClothe {
    public Tie(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearMan() {

    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
