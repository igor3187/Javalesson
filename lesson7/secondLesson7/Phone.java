package com.company.lesson7.secondLesson7;

public class Phone {
    private String number, model;
    private int weight;
    private static int count;

    public static int getCount() {
        return count++;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        count++;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Call: " + name + " from number: " + this.number);
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Phone " + this.number + " send message: " + message + " for numbers: ");
        for (String number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}
