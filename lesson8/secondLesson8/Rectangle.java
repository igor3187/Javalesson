package com.company.lesson8.secondLesson8;

import java.util.Objects;

public class Rectangle extends Shape {

    private int x, y, x1, y1;

    public Rectangle(String color, int x, int y, int x1, int y1) {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x;
        this.y1 = y;
    }

    public Rectangle(String color) {
        super(color);
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

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with " + getColor() + " color" + " and coordinates: x " + getX() + " y " + getY() + " x1 " + getX1() + " y1 " + getY1());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getX() == rectangle.getX() && getY() == rectangle.getY() && getX1() == rectangle.getX1() && getY1() == rectangle.getY1();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getX(), getY(), getX1(), getY1());
    }

    @Override
    public String toString() {
        return "Rectangle{" + "x=" + x + ", y=" + y + ", x1=" + x1 + ", y1=" + y1 + "} " + super.toString();
    }
}
