package com.company.lesson9;

public class NewRectangle extends NewShape {

    private int x1, y1, x2, y2;

    public NewRectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public NewRectangle(String color) {
        super(color);
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

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "NewRectangle{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "} " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник : " + x1 + " " + y1 + " " + x2 + " " + y2 + " цветом : " + getColor());

    }
}
