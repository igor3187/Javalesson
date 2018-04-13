package com.company.lesson7;

public class PhonDemo {


    public static void main(String[] args) {
        Phone phone1 = new Phone("333","Aple",4.2);
        Phone phone2 = new Phone("555","Note");
        Phone phone3 = new Phone();
        System.out.println(Phone.getCount());
        System.out.println("Номер : " + phone1.getNumber() + " модель : " + phone1.getModel() + " вес : " + phone1.getWeight());
        System.out.println("Номер : " + phone2.getNumber() + " модель : " + phone2.getModel() + " вес : " + phone2.getWeight());
        System.out.println("Номер : " + phone3.getNumber() + " модель : " + phone3.getModel() + " вес : " + phone3.getWeight());
        phone1.receiveCall("Mama","88989i8");
        phone1.receiveCall("Mama","88989i8");
        phone1.sendMessage("888888888");
        phone2.sendMessage("345254253","2352523","2345235");
    }
}
