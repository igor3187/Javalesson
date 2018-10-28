package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String model = "Audi", carClass = "Sport";
    private double weight = 1400;
    private Driver driver;
    private Engine engine;

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;

    }

    public Car() {
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.printInfo();
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();

    }

    void start() {
        System.out.println("Let's go!");
    }

    void stop() {
        System.out.println("Stop!");
    }

    void turnRight() {
        System.out.println("Turn Right!");
    }

    void turnLeft() {
        System.out.println("Turn Left!");
    }

    void printInfo() {
        System.out.println(this.model + " " + this.carClass + " " + this.weight + " " + this.driver + " " + this.engine);
    }
}

