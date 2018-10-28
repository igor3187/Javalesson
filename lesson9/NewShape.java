package com.company.lesson9;

import java.util.Objects;

public abstract class NewShape {

    private String color;

    public NewShape(String color) {
        this.color = color;
    }

    public NewShape() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewShape)) return false;
        NewShape newShape = (NewShape) o;
        return Objects.equals(getColor(), newShape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }

    @Override
    public String toString() {
        return "NewShape{" + "color='" + color + '\'' + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

}
