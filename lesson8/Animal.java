package com.company.lesson8;

public abstract class Animal {

    private String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    abstract void sleep();


    @Override
    public String toString() {
        return "Animal{" + "food='" + food + '\'' + ", location='" + location + '\'' + '}';
    }
}
