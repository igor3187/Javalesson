package com.company.lesson8;

import java.util.Objects;

public class Circle1 extends Shape1 {

    private int x = 5;
    private int y = 5;

    public Circle1(String color) {
        super(color);
    }

    public Circle1(String color, int x, int y) {
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
        System.out.println("Рисую круг " + getColor() + getX() + getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle1 circle1 = (Circle1) o;
        return x == circle1.x && y == circle1.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Circle1{" + "x=" + x + ", y=" + y + '}';
    }
}
