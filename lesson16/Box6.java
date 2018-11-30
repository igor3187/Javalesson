package com.company.lesson16;

public class Box6 {

    public double width;
    public double height;
    public double depth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box6{" + "width=" + width + ", height=" + height + ", depth=" + depth + '}';
    }

    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box6() {
        width = -1;  // используем -1 для
        height = -1; // обозначения непроинициализированной
        depth = -1;  // коробки
    }

    Box6(double len) {
        width = len;
        height = len;
        depth = len;
    }
}
