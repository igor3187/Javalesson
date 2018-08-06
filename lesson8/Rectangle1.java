package com.company.lesson8;

import java.util.Objects;

public class Rectangle1 extends Shape1 {

    int x = 10;
    int y = 10;

    public Rectangle1(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Зисую круг " + getColor() + getX() + getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle1 that = (Rectangle1) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Rectangle1{" + "x=" + x + ", y=" + y + '}';
    }
}
