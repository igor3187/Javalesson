package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int carrying;

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine) {
        super(model, carClass, weight, driver, engine);
    }
}
