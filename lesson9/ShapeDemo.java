package com.company.lesson9;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red");
        Circle с2 = new Circle("Red");
        Rectangel r = new Rectangel("Blue",4,3);
        Rectangel r1 = new Rectangel("Yellow",1,6);
       // for (Shape shape : shapes) {
        //    shape.drow();

       // }
        c1.equals( с2);
        System.out.println(c1.equals(с2));
        System.out.println(r.equals(r1));
        System.out.println(c1);
        System.out.println(r);
        System.out.println(r1);
    }
}
