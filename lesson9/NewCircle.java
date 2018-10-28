package com.company.lesson9;

import java.util.Objects;

public class NewCircle extends NewShape {

    private int x, y;
    private int radius;
    static final double P = 3.14;

    public NewCircle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public NewCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public NewCircle(int radius  ){
        this.radius = radius;

    }

    public double getP() {
        return P;
    }

    public NewCircle() {
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг с координатами : " + x + " " + y + " цветом : " + getColor());

    }

    public double findArea(int radius, double P) {
        System.out.println("Радиус окружности = " + getP());
        return radius * P;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewCircle)) return false;
        if (!super.equals(o)) return false;
        NewCircle newCircle = (NewCircle) o;
        return x == newCircle.x && y == newCircle.y && radius == newCircle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, radius);
    }

    @Override
    public String toString() {
        return "NewCircle{" + "x=" + x + ", y=" + y + ", radius=" + radius + "} " + super.toString();
    }

}
