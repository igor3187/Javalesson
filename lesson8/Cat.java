package com.company.lesson8;

public class Cat extends Animal {

    private String claws;
    private String food;
    private String location;

    public Cat(String food, String location, String claws) {
        super(food, location);
        this.claws = claws;
        this.food = food;
        this.location = location;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat make noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }
}
