package com.company.lesson9;

public class FruitDemo {

    public static void main(String[] args) {
        Fruit apple1 = new Apple(3);
        Fruit apple2 = new Apple(4);
        Fruit pear = new Pear(5);

        Fruit fruits [] = {apple1, apple2, pear};
        double sum = 0;
        for (Fruit fruit : fruits ){
            sum += fruit.coast();
            System.out.println(fruit.coast());
        }

        System.out.println("Общая стоимость фруктов" + sum);

        apple1.printManufacturerInfo();
    }
}
