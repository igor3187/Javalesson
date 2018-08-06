package com.company.lesson11;

import java.util.Objects;

public abstract class Clothe {
    private Size size;
    private int price;
    private String color;

    public Clothe(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothe clothe = (Clothe) o;
        return price == clothe.price && size == clothe.size && Objects.equals(color, clothe.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, price, color);
    }

    @Override
    public String toString() {
        return "Clothe{" + "size=" + size + ", price=" + price + ", color='" + color + '\'' + '}';
    }
}
