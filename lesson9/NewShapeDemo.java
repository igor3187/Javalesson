package com.company.lesson9;

public class NewShapeDemo {
    public static void main(String[] args) {
        NewCircle newCircle = new NewCircle("red", 3, 4, 6);
        NewCircle newCircle2 = new NewCircle("blue", 23, 24, 26);
        NewCircle newCircle1 = new NewCircle();
        NewRectangle newRectangle = new NewRectangle("yellow", 3, 3, 3, 3);
        NewShape[] shape = {newCircle, newCircle2, newRectangle};
        for (NewShape newShapes : shape) {
            newShapes.draw();
        }
/*
        System.out.println(newCircle.equals(newCircle2));
        System.out.println(newRectangle);
        System.out.println(newCircle);
        System.out.println(newCircle2);*/

        System.out.println(newCircle.findArea(4, 3.14));
    }
}
