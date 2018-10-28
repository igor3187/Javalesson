package com.company.lesson8;

public class Veterinarian {

 public    void treatAnimal(Animal animal) {
        System.out.println("Животное у ветеринара. Любит кушать: " + animal.getFood() + " и обитает: " + animal.getLocation());
    }
}
