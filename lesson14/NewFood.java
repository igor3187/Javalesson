package com.company.lesson14;

public class NewFood {
    public static void main(String[] args) {
        NewFood newFood = new NewFood();
        NewCookable c = new NewCookable() {
            @Override
            public void cook() {
                System.out.println("cooking a potato");}
        };

        //newFood.prepare();
    }

    private void prepare(Cookable c) {
        c.cook("");
    }
}
