package com.company.lesson10.Clothes;


public class Pants extends Clothes implements ManClothe, WomanClothe {

    public Pants(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearMan() {
        System.out.println();
    }

    @Override
    public void toWearWoman() {

    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}

