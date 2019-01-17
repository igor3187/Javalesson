package com.company.lesson8.secondLesson8;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("blue", 2, 3, 4);
        Shape circle1 = new Circle("blue", 2, 3, 4);
        Shape rectangle = new Rectangle("white", 3, 6, 8, 9);

        Shape[] shapes = {circle, rectangle};
        for (Shape s : shapes) {
            s.draw();
        }
        System.out.println(circle.equals(rectangle));
        System.out.println(circle.equals(circle1));
        System.out.println(circle);
    }
}
