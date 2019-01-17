package com.company.lesson10.ClothingStore;

public class Studio {

    public static void main(String[] args) {

        Clothe tie = new Tie(32, 3.34, "black");
        Clothe tShort = new TShort(34, 4.20, "withe");
        Clothe skirt = new Skirt(36, 6.50, "blue");
        Clothe pants = new Pants(38, 8.50, "grey");


        Clothe[] clothes = {tie, tShort, skirt, pants};
        Studio.dressMan(clothes);
        Studio.dressWoman(clothes);
    }
    //getEquals(thie, tShort, skirt, pants);


    static void dressMan(Clothe[] clothes) {
        for (Clothe clothe : clothes) {
            if (clothe instanceof ManClothe) System.out.println(clothe + " Man clothe");
        }
    }

    static void dressWoman(Clothe[] clothes) {
        for (Clothe clothe : clothes) {
            if (clothe instanceof WomanClothe) System.out.println(clothe + " Woman clothe");
        }
    }
}