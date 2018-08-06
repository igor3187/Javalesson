package com.company.lesson8;

import java.util.Objects;

public abstract class Shape1 {

    private String color;

    public Shape1(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape1 shape1 = (Shape1) o;
        return Objects.equals(color, shape1.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shape1{" + "color='" + color + '\'' + '}';
    }
}
