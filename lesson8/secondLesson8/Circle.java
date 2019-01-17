package com.company.lesson8.secondLesson8;

import java.util.Objects;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(String color) {
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with " + getColor() + " color and coordinates: x " + getX() + " y " + getY() + " radius: " + getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return getX() == circle.getX() && getY() == circle.getY() && getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getX(), getY(), getRadius());
    }
    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + "} " + super.toString();
    }
}
