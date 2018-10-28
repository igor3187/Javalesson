package com.company.lesson8;

public class Flower {
    private String country;
    private int shelfLifeDay;
    private double price;
    private static int count = 0;
    private static double total;

    @Override
    public String toString() {
        return "Flower{" + "country='" + country + '\'' + ", shelfLifeDay=" + shelfLifeDay + ", price=" + price + '}';
    }

    public Flower(String country, int shelfLifeDay, double price) {
        this.country = country;
        this.shelfLifeDay = shelfLifeDay;
        this.price = price;
        count++;
        total++;
    }

    private static int getBouquet1() {
        return count;
    }

    public static double getTotal() {
        return total;
    }

    public String getCountry() {
        return country;
    }

    public int getShelfLifeDay() {
        return shelfLifeDay;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Ficus ficus = new Ficus("Germany", 15, 3);
        Rose rose = new Rose("France", 10, 5);
        Tulip tulip = new Tulip("Holland", 7, 4);
        Violet violet = new Violet("England", 5, 2);

        getBouquet(ficus, tulip, violet);

        System.out.println("Продан один букет из трех разных цветов ");
    }

    private static void getBouquet2(Ficus ficus, Rose rose, Violet violet) {
        Flower[] bouquet2 = {ficus, rose, violet};
        for (Flower flower : bouquet2) {
            System.out.println(flower);
        }
    }

    private static void getBouquet1(Rose rose, Tulip tulip, Violet violet) {
        Flower[] bouquet1 = {rose, tulip, violet};
        for (Flower flower : bouquet1) {
            System.out.println(flower);
        }
    }

    private static void getBouquet(Ficus ficus, Tulip tulip, Violet violet) {
        Flower[] bouquet = {ficus, violet, tulip};
        for (Flower flower : bouquet) {
            System.out.println(flower);
        }
    }

}