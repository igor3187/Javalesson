package com.company.lesson10.Clothes;

public class Atelier {

    public static void main(String[] args) {

        Clothes tshirt = new Tshirt(Size.S, 10.50, "red");
        Clothes tshirt1 = new Tshirt(Size.M, 8.40, "white");
        Clothes pants = new Pants(Size.L, 40.90, "black");
        Clothes pants1 = new Pants(Size.XS, 36.80, "blue");
        Clothes skirt = new Skirt(Size.XXS, 29.99, "pink");
        Clothes tie = new Tie(Size.M, 5.60, "green");

        Clothes[] clothesType = {tie, tshirt, tshirt1, pants, pants1, skirt};

        Atelier.toWearWoman(clothesType);
        Atelier.toWearMan(clothesType);
    }

    static void toWearWoman(Clothes[] clothesType) {
        for (Clothes clothe : clothesType){
            if (clothe instanceof WomanClothe){
                System.out.println(clothe);
            }
        }
    }

    static void toWearMan(Clothes[] clothesType) {
        for (Clothes clothe : clothesType) {
            if (clothe instanceof ManClothe) {
                System.out.println(clothe);
            }
        }
    }
}
