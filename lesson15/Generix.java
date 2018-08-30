package com.company.lesson15;

import com.company.lesson9.Aspirant;

import java.io.Serializable;

public class Generix<T extends Comparable, V extends Aspirant & Serializable, K extends Number> {
    private T tgO1;
    private V tgO2;
    private K tgO3;

    public Generix(T tgO1, V tgO2, K tgO3) {
        this.tgO1 = tgO1;
        this.tgO2 = tgO2;
        this.tgO3 = tgO3;
    }

    public T getTgO1() {
        return tgO1;
    }

    public V getTgO2() {
        return tgO2;
    }

    public K getTgO3() {
        return tgO3;
    }

    void showTypes() {
        System.out.println("Type of T is " + tgO1.getClass().getName());

        System.out.println("Type of V is " + tgO2.getClass().getName());

        System.out.println("Type of V is " + tgO3.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeGen<Integer, String, Character> tgO = new ThreeGen<>(88, "Generics", 'a');
        Generix<Integer, Aspirant, Integer> tg1 = new Generix<>(88, new Aspirant(), 88);

        tgO.showTypes();
        tg1.showTypes();

    }

}
