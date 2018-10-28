package com.company.lesson9;

public class NewFruitDemo {
    public static void main(String[] args) {
        NewApple newApple = new NewApple(3.200);
        NewApricot newApricot = new NewApricot(2.100);
        NewPear newPear = new NewPear(1.500);

        NewFruit[] newFruits = {newApple, newApricot, newPear};
        double sum = 0;
        for (NewFruit newFruit : newFruits) {
            sum += newFruit.fruitPrice();
            System.out.println(newFruit.fruitPrice());
        }
        System.out.println("Общая стоимость фруктов: " + sum);
        newApple.printManufacturerInfo();
    }
}
