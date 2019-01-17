package com.company.lesson7;

public class Person {
    private String fullName;
    private int age;

    private Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void move() {
        System.out.println("I'm running");
    }

    private void talk(String fullName, int age) {
        System.out.println("My name is " + fullName + " and my age is " + age);

    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Bob", 30);

        person.talk("Joe", 23);
        person.move();
        System.out.println("Hi my name is " + person1.fullName + " and my age is " + person1.age);
        person1.move();
    }

    @Override
    public String toString() {
        return String.format( "Person fullName=%s, age=%d", fullName, age);
    }
}
