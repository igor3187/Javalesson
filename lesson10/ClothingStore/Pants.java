package com.company.lesson10.ClothingStore;

public class Pants extends Clothe implements ManClothe, WomanClothe {
    public Pants(int size, double prise, String color) {
        super(size, prise, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
