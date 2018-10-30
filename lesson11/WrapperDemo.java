package com.company.lesson11;

public class WrapperDemo {
    public static void main(String[] args) {
        Double aDouble = 3.14;
        Double aDouble1 = 3.14;
        Double aDouble2 = Double.valueOf("3.14");
        Double aDouble3 = 3.14;
        Double aDouble4 = Double.parseDouble("3.2");
        int d = aDouble4.intValue();
        System.out.println(aDouble4);

        System.out.println(aDouble);
        System.out.println(aDouble1);
        System.out.println(aDouble2);
        System.out.println(aDouble3);
        System.out.println(aDouble4);
    }
}
