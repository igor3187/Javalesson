package com.company.lesson9;

public abstract class NewFruit {

    double weight;

    public NewFruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract double fruitPrice();

    void printManufacturerInfo() {
        System.out.println("Made in Ukraine!");
    }

    @Override
    public String toString() {
        return "NewFruit{" + "weight=" + weight + ", price=" + '}';
    }
}
