package com.company.lesson10;

import java.util.Objects;

public abstract class Clothes {

    private Size clothesSize;
    private double cost;
    private String color;

    Clothes(Size clothesSize, double cost, String color) {
        this.clothesSize = clothesSize;
        this.cost = cost;
        this.color = color;
    }

    private Size getClothesSize() {
        return clothesSize;
    }

    private void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

    private double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.getCost(), getCost()) == 0 && getClothesSize() == clothes.getClothesSize() && Objects.equals(getColor(), clothes.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClothesSize(), getCost(), getColor());
    }

    @Override
    public String toString() {
        return "Clothes{" + "clothesSize=" + clothesSize + ", cost=" + cost + ", color='" + color + '\'' + '}';
    }
}
