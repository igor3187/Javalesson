package com.company.lesson14.generics;

import com.company.lesson8.Animal;
import com.company.lesson8.Dog;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V extends Animal & Serializable, K extends Number> {

    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3() {
        return ob3;
    }

    public static void main(String[] args) {
        ThreeGen<Integer, Dog, Double> tgObj = new ThreeGen<>(88, new Dog("", "", ""), 3.14);

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        Dog str = tgObj.getOb2();
        System.out.println("value: " + str);

        Double d = tgObj.getOb3();
        System.out.println("value: " + d);
    }

    public void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());

        System.out.println("Type of V is " + ob2.getClass().getName());

        System.out.println("Type of K is " + ob3.getClass().getName());
    }
}
