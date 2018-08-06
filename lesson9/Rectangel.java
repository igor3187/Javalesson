package com.company.lesson9;

public class Rectangel extends Shape {
    private int x1,y1;

    public Rectangel(String color, int x1, int y1) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
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

    public void drow(){
        System.out.println("Рисую прямоугольник : " + getColor());
    }

    @Override
    public String toString() {
        return "Rectangel{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
