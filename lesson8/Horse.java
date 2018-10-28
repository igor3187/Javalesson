package com.company.lesson8;

public class Horse extends Animal {

    private String saddle, hoof;
    private String food;
    private String location;

    public Horse(String food, String location, String saddle, String hoof) {
        super(food, location);
        this.saddle = saddle;
        this.hoof = hoof;
        this.food = food;
        this.location = location;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse make noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    void sleep() {
        System.out.println("Horse is sleeping");
    }
}
