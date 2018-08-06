package com.company.lesson7;



public class Phone {
    private static int count;
    private String number,model;
    private double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
        count++;
    }

    Phone() {
        count++;
    }

    static int getCount() {
        return count;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) { System.out.println("Call " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Call " + name + " phone number " + number);
    }

    void sendMessage(String... numbers) {
        System.out.println("Соообщение отправлено: ");
        for (String number : numbers) {
            System.out.println(number + ", ");
        }
    }
}
