package com.company.lesson8;

public class Dog extends Animal {

    private String collar;

    public Dog(String food, String location, String collar) {
        super(food, location);
        this.collar = collar;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog make noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
