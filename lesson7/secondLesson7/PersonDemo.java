package com.company.lesson7.secondLesson7;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan", 30);
        Person person2 = new Person("Oleg");

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
