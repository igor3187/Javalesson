package com.company.lesson7.secondLesson7;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return String.format( "Person{" + "name=%s" + name + '\'' + ", age=%d" + age + '}');
    }

    void move() {
        System.out.println("Person " + this.name + " " + this.age + " is moving");
    }

    void talk() {
        System.out.println("Person " + this.name + " " + this.age + " is talking");
    }
}
