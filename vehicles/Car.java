package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public static void main(String[] args) {


        String model, carClass;
        double weight;
        Driver driver = new Driver();
        Engine engine = new Engine();

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
        System.out.println();
    }
}

