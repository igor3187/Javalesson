package com.company.lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 3.14d;
        Double double2 = 5.14d;
        Double double3 = 7.12d;
        Double double4 = 9.12d;

        double d = Double.parseDouble("3.11");

        String adouble = Double.toString(6.14);

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3.shortValue());
        System.out.println(double3.intValue());
        System.out.println(double3.floatValue());
        System.out.println(double4);
        System.out.println(d);
        System.out.println(adouble);

    }
}
