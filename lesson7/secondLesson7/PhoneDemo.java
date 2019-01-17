package com.company.lesson7.secondLesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("80730781232", "IPhone", 300);
        Phone phone2 = new Phone("80666797911", "Nomi");
        Phone phone3 = new Phone();

       /* phone1.receiveCall("Mama");
        phone1.receiveCall("Mama", "80685358016");*/
        phone2.sendMessage("\"Hello World\"", "0777777777 ", "0999999999");

        phone1.setWeight(300);
        phone1.setModel("Iphone");
        phone1.setNumber("80685358016");

       /* phone2.weight = 200;
        phone2.model = "Nomi";
        phone2.number = "80666797911";

        phone3.weight = 400;
        phone3.model = "Samsung";
        phone3.number = "80730781232";*/

        Phone.setCount(5);

        System.out.println("model:" + phone1.getModel() + "  number:" + phone1.getNumber() + "  weight:" + phone1.getWeight());
        System.out.println("model:" + phone2.getModel() + "  number:" + phone2.getNumber() + "  weight:" + phone2.getWeight());
        System.out.println("model:" + phone3.getModel() + "  number:" + phone3.getNumber() + "  weight:" + phone3.getWeight());
    }
}
