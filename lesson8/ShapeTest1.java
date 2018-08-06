package com.company.lesson8;

public class ShapeTest1 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1("Blue", 5, 5);
        Circle1 circle2 = new Circle1("Blue", 5, 5);
        Rectangle1 rectangle1 = new Rectangle1("Blue", 10, 10);
        Rectangle1 rectangle2 = new Rectangle1("Blue", 10, 10);

        Shape1[] shape1 = {circle1, rectangle1};

        for (Shape1 shape : shape1) {
            shape.draw();
        }

        System.out.println(circle1.equals(circle2));
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(circle1);
        System.out.println(rectangle1);

    }

}
