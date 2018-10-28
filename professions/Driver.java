package com.company.professions;

import com.company.lesson7.Person;

public class Driver extends Person {
    public String name, expirience;

    public Driver(String name, String expirience) {
        super(name,30 );
        this.name = name;
        this.expirience = expirience;
    }

    public String getName() {
        return name;
    }

    public String getExpirience() {
        return expirience;
    }
}
