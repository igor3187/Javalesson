package com.company.lesson10.Clothes;

public class Tshirt extends Clothes implements ManClothe, WomanClothe {

    public Tshirt(Size clothesSize, double cost, String color) {
        super(clothesSize, cost, color);
    }

    @Override
    public void toWearMan() {

    }

    @Override
    public void toWearWoman() {

    }

    @Override
    public String toString() {
        return "Tshirt{} " + super.toString();
    }
}
