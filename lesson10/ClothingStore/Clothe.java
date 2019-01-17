package com.company.lesson10.ClothingStore;

import java.util.Objects;

public abstract class Clothe {
    private int size;
    private double prise;
    private String color;

    public Clothe(int size, double prise, String color) {
        this.size = size;
        this.prise = prise;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothe)) return false;
        Clothe clothe = (Clothe) o;
        return getSize() == clothe.getSize() && Double.compare(clothe.getPrise(), getPrise()) == 0 && Objects.equals(getColor(), clothe.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getPrise(), getColor());
    }

    @Override
    public String toString() {
        return "Clothe{" + "size=" + size + ", prise=" + prise + ", color='" + color + '\'' + '}';
    }
}
