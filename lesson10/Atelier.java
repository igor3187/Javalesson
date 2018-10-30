package com.company.lesson10;

public class Atelier {

    public static void main(String[] args) {

        Clothes tshirt = new Tshirt(Size.S, 10.50, "red");
        Clothes tshirt1 = new Tshirt(Size.M, 8.40, "white");
        Clothes pants = new Pants(Size.L, 40.90, "black");
        Clothes pants1 = new Pants(Size.XS, 36.80, "blue");
        Clothes skirt = new Skirt(Size.XXS, 29.99, "pink");
        Clothes tie = new Tie(Size.M, 5.60, "green");

        Clothes[] clothesType = {tie, tshirt, tshirt1, pants, pants1, skirt};
        for (Clothes clothes : clothesType) ;

        Atelier.toWearWoman(clothesType);
        Atelier.toWearMan(clothesType);
    }

    public static void toWearWoman(Clothes[] clothesType) {
        System.out.println("Woman can dress: T-Shirt " + clothesType[1] + " Pants " + clothesType[4] + " Skirt " + clothesType[5]);
    }

    public static void toWearMan(Clothes[] clothesType) {
        System.out.println("Man can dress: Tie " + clothesType[0] + " T-Short " + clothesType[2] + " Pants " + clothesType[3]);
    }
}
