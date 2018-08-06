package com.company.lesson9;

public class Circle extends Shape {

    public Circle(String color) {
        super(color);
    }

    public void drow(){
        System.out.println("Рисую круг : " + getColor());
    }

}
