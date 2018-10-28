package com.company.lesson7;

public class SomePhone {

    private static int count;

    private String model;
    private String number;
    private double weight;

    public SomePhone() {
        count++;
    }

    public SomePhone(String model, String number, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public SomePhone(String number, String model) {
        this.model = model;
        this.number = number;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("звонит " + name + " номер " + number);
    }

    void sendMessage(String... numbers) {
        System.out.println("Отправляем сообщение телефонам: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
