package com.company.lesson10;

public class WrapperDemo {
    public static void main(String[] args) {
        //Short sh = new Short((short)1);
        Short sh = (short)1;
        //Short sh1 = new Short("1");
        Short sh1 = Short.valueOf("1");

        //Double d = new Double(2.23);
        Double d = 2.23;
        Double d1 = new Double("2.23");
        Double d3 = Double.valueOf(3333333.14);
        Double d4 = Double.valueOf("3.14");
        Double d5 = Double.parseDouble("5.15");

        System.out.println(sh);
        System.out.println(sh1);
        System.out.println(d + d1);
        System.out.println(d1);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d3.byteValue());
        System.out.println(d3.shortValue());
        System.out.println(d3.intValue());
        System.out.println(d3.longValue());
        System.out.println(d3.floatValue());
    }
}
