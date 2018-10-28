package com.company.lesson8;

public class AnimalDemo {

    public static void main(String[] args) {

        Cat cat = new Cat("Fish", "Planet Earth", "sharp claws");
        Dog dog = new Dog("meat", "Planet Earth", "skin collar");
        Horse horse = new Horse("hay", "Planet Earth", "new saddle", "strong hoof");
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = {cat, dog, horse};
        for (Animal animal : animals) {
            System.out.println("Животные у ветеринара, место обитания: " + animal.getLocation() + " и любят есть: " + animal.getFood());
            veterinarian.treatAnimal(animal);
            animal.eat();
        }

        cat.makeNoise();
        cat.sleep();
        dog.makeNoise();
        horse.sleep();
    }
}
