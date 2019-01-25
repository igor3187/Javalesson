package com.company.lesson14;

import com.company.lesson8.Animal;
import com.company.lesson8.Dog;

import java.io.Serializable;

public class Generics<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public Generics(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public static void main(String[] args) {
        Generics<String, Dog, Float> g = new Generics<>("str", new Dog("meat", "Ukraine", "black"), 5.3f);
        g.getClassName();
    }

    public void getClassName() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
        System.out.println(ob3.getClass().getName());
    }
}
