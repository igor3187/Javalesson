package com.company.lesson10.Clothes;

public class Skirt extends Clothes implements WomanClothe {
    public Skirt(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearWoman() {

    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
