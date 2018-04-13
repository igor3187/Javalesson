package com.company.lesson14;

public class Toy {
    private int prise;
    private String name;
    private String action;


    public Toy(int prise, String name, String action) {
        this.prise = prise;
        this.name = name;
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public int getPrise() {
        return prise;
    }

    public void setPrise(int rpise) {
        this.prise = rpise;
    }

    public String getName() {
        return name;
    }

    public void setName(String polly) {
        this.name = polly;
    }

    public static void play(Toy[] toys) {
        for (Toy toy : toys)
            toy.play();

    }

    public void play() {
        System.out.println(getAction() + " " + getName() + " " + getPrise());
    }

    public static int calculatePrise(Toy[] toys) {
        int summ = 0;
        for (Toy toy : toys) {
            summ += toy.getPrise();
        }
        return summ;
    }


    public static void main(String[] args) {

        Toy toy1 = new Toy(20, "Polly", "Run");
        Toy toy2 = new Toy(10, "Dolly", "Run");
        Toy toy3 = new Toy(30, "Molly", "Run");

        Toy[] toys = {toy1, toy2, toy3};
        System.out.println();
        System.out.println(calculatePrise(toys));
        play(toys);
    }

    //создать статический метод котрый принемает на вход массив игрушек и считает их стоимость.
    // Плей это не статический метод он выводит на экран Экшн.Посчитать количество созданных игрушек.

}